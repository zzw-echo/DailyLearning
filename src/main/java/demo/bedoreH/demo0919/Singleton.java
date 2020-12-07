package demo.bedoreH.demo0919;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/21 14:45
 */
public class Singleton {
    static int i = 0;

    private Singleton() {
        System.out.println("这是一个单例");
        ++i;
    }


    private static Singleton INSTANCE = null;

    public static Singleton getINSTANCE(){

        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton instance = getINSTANCE();
        Singleton instance2 = getINSTANCE();



    }

}
