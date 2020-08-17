package demo.draft.demo0812.adapter;

/**
 * 作者： zhangzewen
 * 邮箱： zzw.me@qq.com
 * 时间： 2020/8/12 18:30
 */
public class VoltageAdapter extends Voltage220 implements Voltage5V {

    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("适配器开始适配电压");
        int dst = src / 44;
        System.out.println("适配完成后的输出电压：" + dst);
        return dst;
    }
}
