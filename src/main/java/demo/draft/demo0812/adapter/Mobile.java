package demo.draft.demo0812.adapter;

/**
 * 作者： zhangzewen
 * 邮箱： zzw.me@qq.com
 * 时间： 2020/8/12 19:42
 */
public class Mobile {
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V() == 5){
            System.out.println("电压为5V，开始充电");
        }else if (voltage5V.output5V() > 5){
            System.out.println("电压超过5V。。。");
        }
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter());
    }
}
