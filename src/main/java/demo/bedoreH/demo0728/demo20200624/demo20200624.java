package demo0728.demo20200624;

import java.text.DecimalFormat;

/**
 * Created by zhangzewen on 2020/6/24
 */
public class demo20200624 {
    public static void demo1(){
        double e=1;
        double jc=1;//求阶bai乘，并存入jc中
        int i=1;
        while(1/jc>=1e-6){
            e=e+1/jc;
            i++;
            jc=jc*i;
        }
        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(e));
    }

    public static void main(String[] args) {
        demo20200624.demo1();
    }
}
