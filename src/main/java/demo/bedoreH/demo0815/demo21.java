package demo.bedoreH.demo0815;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/15 15:08
 * 描述 ：
 */
public class demo21 {

    public boolean IsValidExp(String s) {
        if (s.isEmpty()) return true;
        if (s.length() % 2 != 0) return false;

        int count = 0;
        int len = s.length();

        while (count < len / 2) {
            s = s.replace("{}", "").replace("[]", "").replace("()", "");
            count++;
        }

        if (s.length() > 0) {
            return false;
        }else {
            return true;
        }


    }
}
