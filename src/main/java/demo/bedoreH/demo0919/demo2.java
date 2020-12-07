package demo.bedoreH.demo0919;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/19 10:35
 */
public class demo2 {

    static Thread threadA = new Thread(new Runnable(){
        @Override
        public void run() {
            System.out.print("A");
        }
    });
    static Thread threadB = new Thread(new Runnable(){
        @Override
        public void run() {
            System.out.print("B");
        }
    });
    static Thread threadC = new Thread(new Runnable(){
        @Override
        public void run() {
            System.out.print("C");
        }
    });
    static Thread threadD = new Thread(new Runnable(){
        @Override
        public void run() {
            System.out.print("D");
        }
    });

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 6; i++) {
//            threadA.start();
//            threadA.join();
//            threadB.start();
//            threadB.join();
//            threadC.start();
//            threadC.join();
//            threadD.start();
//            threadD.join();
//        }
        threadA.start();
        threadA.join();
        threadB.start();
        threadB.join();
        threadA.start();
        threadA.join();


    }

}
