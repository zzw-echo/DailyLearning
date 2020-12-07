package demo.bedoreH.demo0923.抽象工厂;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 22:12
 */
public interface Cpu {
    void run();

    class Cpu1 implements Cpu {
        @Override
        public void run() {
            System.out.println("cpu1");
        }
    }

    class Cpu2 implements Cpu {
        @Override
        public void run() {
            System.out.println("cpu2");
        }
    }

}
