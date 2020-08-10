package demo.draft.demo0807.test1.Singleton2;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/7 11:02
 * @ Description：单例
 */
public class Singleton1 {
    //饿汉式
    private Singleton1() {
        System.out.println("Singleton");
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}
//懒汉式
class Singleton2{
    private Singleton2(){
        System.out.println("Singleton");
    }
    private static Singleton2 instance;
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
//双检锁
class Singleton3{
    private Singleton3(){
        System.out.println("Singleton");
    }
    private static Singleton3 instance;
    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized(Singleton3.class){
                if (instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
//静态内部类
class Singleton4{
    private Singleton4(){
        System.out.println("Singleton");
    }
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    public static final Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
























