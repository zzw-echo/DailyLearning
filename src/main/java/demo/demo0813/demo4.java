package demo.demo0813;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/13 20:06
 * 描述 ：
 */
public class demo4 {

    public int GetCoinCount(int N) {
        // write code here
        int n = 1024 - N;
        int s = 0;
        s += n / 64;
        n %= 64;
        s += n / 16;
        n %= 16;
        s += n / 4;
        n %= 4;
        s += n;
        return s;
    }

}
