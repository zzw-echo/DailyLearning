package demo.demo1007;

import java.math.BigDecimal;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/10/7 20:35
 */
public class demo1 {

    public static double myAdd(double v1, double v2){
        BigDecimal b1 = new BigDecimal(v1);


        System.out.println(b1.doubleValue());


        return 0;
    }

    public static void main(String[] args) {

        double d1 = 0.1;
        BigDecimal b1 = new BigDecimal(d1);

        System.out.println(d1);
        System.out.println(b1);

    }


}
