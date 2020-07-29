/**
 * Created by zhangzewen on 2020/7/26
 */
public class Lock1 implements Runnable {

    @Override
    public void run() {

        try {
            System.out.println("Lcok1 running");
            while (true) {
                synchronized (DeadLock.obj1){
                    System.out.println("Lock1 lock obj1");
                    Thread.sleep(3000);
                    synchronized (DeadLock.obj2){
                        System.out.println("Lock1 lock obj2");
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
