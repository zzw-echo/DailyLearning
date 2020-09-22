package demo.demo0921;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/22 13:16
 */
public class Singleton {

    private Singleton() {
        System.out.println("这是一个单例。。");
    }

    private static Singleton INSTANCE = null;

    public static Singleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
