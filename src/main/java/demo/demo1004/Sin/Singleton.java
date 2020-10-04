package demo.demo1004.Sin;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/10/4 16:16
 */
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton(){
        System.out.println("这是一个单例。。");
    }

    public static Singleton getInstance(){
        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
