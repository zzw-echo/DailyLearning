package demo.demo0807.test1.Singleton1;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/7 13:22
 * @ Description：
 */
public class Singleton1 {
    //1、饿汉式
    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}

class Singleton2 {
    //2、懒汉式
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

class Singleton4{
    //4、静态内部类
    private Singleton4(){}

    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    public static final Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }

}























