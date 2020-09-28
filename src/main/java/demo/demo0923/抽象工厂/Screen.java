package demo.demo0923.抽象工厂;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 22:14
 */
public interface Screen {
    void size();

    class Screen1 implements Screen {
        @Override
        public void size() {
            System.out.println("Screen1");
        }
    }

    class Screen2 implements Screen {
        @Override
        public void size() {
            System.out.println("Screen2");
        }
    }

}
