package demo.demo0815;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/15 15:13
 * 描述 ：
 */
public class demo31 {

    private static int coinNum(int N) {

        int m = 1024 - N;
        int s = 0;

        s += m / 64;
        m %= 64;
        s += m / 16;
        m %= 16;
        s += m / 4;
        m %= 4;
        s += m;

        return s;

    }

}
