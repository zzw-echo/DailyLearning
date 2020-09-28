package demo.bedoreH.demo0829;

import java.math.BigDecimal;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/29 19:23
 */
public class demo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(Double.toString(0.1));
        BigDecimal bd2 = new BigDecimal(Double.toString(0.2));
        System.out.println(bd1.add(bd2));
    }
}
