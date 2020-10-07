package demo.demo1007;

import java.math.BigDecimal;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/10/7 20:35
 */
public class demo1 {


    public static void main(String[] args) {

        double myD1 = 0.1;
        BigDecimal myB1 = new BigDecimal(Double.toString(myD1));

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        BigDecimal add = a.add(b);
        BigDecimal subtract = a.subtract(b);
        BigDecimal multiply = a.multiply(b);
        BigDecimal divide = a.divide(b);
        BigDecimal divide2 = a.divide(b).setScale(2, BigDecimal.ROUND_HALF_DOWN);

        int compareTo = a.compareTo(b);

    }

    public static double myAdd(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(v1);
        System.out.println(b1.doubleValue());
        return 0;
    }

}
