package demo.demo0919;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/19 10:17
 */
public class demo1 {
    public boolean isEff(String s) {
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        if (s.length() > 0) {
            return false;
        } else {
            return true;
        }
    }
}
