package demo.bedoreH.demo0806.shopee.Single;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 23:33
 * @ Description：饿汉式
 */

//只有一个实例

//懒汉式
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    private static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

//饿汉式
class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getSingleton2() {
        return instance;
    }
}

//双重加锁机制
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

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

//静态内部类
class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {
    }

    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
























