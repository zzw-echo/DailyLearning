package demo.bedoreH.demo0813;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/13 19:46
 * 描述 ：
 */
public class demo2 {

    public boolean IsValidExp(String s) {
        // write code here
        if (s.length() < 2 || s.length() % 2 != 0) {
            if (s.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }

        int count = 0;
        int length = s.length();
        while (count < length / 2) {
            s = s.replace("{}", "").replace("[]", "").replace("()", "");
            count++;
        }
        if (s.length() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "helloohe";
        s = s.replace("hl", "");
        System.out.println(s);
    }

}
