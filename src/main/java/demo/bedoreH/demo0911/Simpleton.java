package demo.bedoreH.demo0911;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/12 13:56
 */
public class Simpleton {

    private static volatile Simpleton INSTANCE;
    //这里的voliate关键字作用，禁止指令重排序，23存在指令重排序
    //1.分配内存空间
    //2.构造器初始化
    //3.将对象指向内存地址

    private Simpleton(){
        System.out.println("simpletom");
    }

    public static Simpleton getInstance(){
        if (INSTANCE == null){
            synchronized (Simpleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Simpleton();
                }
            }
        }
        return INSTANCE;
    }

}
