package demo.demo0813;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/14 22:06
 * 描述 ：
 */
public class demo23 {

    public boolean IsValidExp(String s) {

        if (s.length() % 2 != 0) {
            if (s.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }


        int count = 0;
        int len = s.length();

        while (count < len / 2) {
            s = s.replace("{}", "").replace("[]", "").replace("()", "");
            count++;
        }
        if (s.length() > 0) {
            return false;
        } else {
            return true;
        }
    }

}
