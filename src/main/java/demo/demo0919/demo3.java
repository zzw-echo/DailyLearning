package demo.demo0919;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/19 10:48
 */
public class demo3 {

        public static class ThreadPrinter implements Runnable {
            private String name;
            private Object prev;
            private Object self;

            private ThreadPrinter(String name, Object prev, Object self) {
                this.name = name;
                this.prev = prev;
                this.self = self;
            }

            @Override
            public void run() {
                int count = 1;

                while (count < 7) {// 多线程并发，不能用if，必须使用whil循环
                    synchronized (prev) { // 先获取 prev 锁
                        synchronized (self) {// 再获取 self 锁
                            System.out.print(name + count+" ");//打印
                            if (name.equals("D")){
                                System.out.println();
                            }
                            count++;

                            self.notifyAll();// 唤醒其他线程竞争self锁，注意此时self锁并未立即释放。
                        }
                        //此时执行完self的同步块，这时self锁才释放。
                        try {
                            prev.wait(); // 立即释放 prev锁，当前线程休眠，等待唤醒
                            /**
                             * JVM会在wait()对象锁的线程中随机选取一线程，赋予其对象锁，唤醒线程，继续执行。
                             */
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }

        public static void main(String[] args) throws Exception {
            Object a = new Object();
            Object b = new Object();
            Object c = new Object();
            Object d = new Object();
            ThreadPrinter ta = new ThreadPrinter("A", d, a);
            ThreadPrinter tb = new ThreadPrinter("B", a, b);
            ThreadPrinter tc = new ThreadPrinter("C", b, c);
            ThreadPrinter td = new ThreadPrinter("D", c, d);

            new Thread(ta).start();
            Thread.sleep(10);//保证初始ABC的启动顺序
            new Thread(tb).start();
            Thread.sleep(10);
            new Thread(tc).start();
            Thread.sleep(10);
            new Thread(td).start();
            Thread.sleep(10);
        }

}
