package demo.demo0909;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/9 21:15
 */
public class demo2 {
    public static void main(String[] args) {
        int i;
        int a, b, c, d;
        for (i = 0; i < 10000; i++) {
            a = i / 1000;
            b = (i - a * 1000) / 100;
            c = (i - a * 1000 - b * 100) / 10;
            d = i - a * 1000 - b * 100 - c * 10;
            if (((i + b * 1000 + c * 100 + d * 10 + a * 1) == 8888) && d >= 0) {
                System.out.println(a + " " + b + " " + c + " " + d);
            }
        }
    }
}
