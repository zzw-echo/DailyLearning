package demo.bedoreH.demo0807.test1.Singleton5;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/7 14:37
 * @ Description：单例
 */
public class Singleton1 {
    //饿汉式
    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}

class Singleton2 {
    //懒汉式
    private Singleton2() {
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

class Singleton3 {
    //双检锁
    private Singleton3() {
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

class Singleton4 {
    //静态内部类
    private Singleton4() {
    }

    private static class SingletonHolder {
        private final static Singleton4 INSTANCE = new Singleton4();
    }

    public final static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}















