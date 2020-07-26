/**
 * Created by zhangzewen on 2020/7/26
 */
public class DeadLock {
    public static final String obj1 = "obj1";
    public static final String obj2 = "obj2";

    public static void main(String[] args) {
        Thread a = new Thread(new Lock1());
        Thread b = new Thread(new Lock2());
        a.start();
        b.start();
    }
}
