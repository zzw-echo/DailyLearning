package demo.bedoreH.demo0910;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/10 20:25
 */
public class demo3 {

    public boolean isNum(String s) {
        if (s == null || s.length() == 0) return false;
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        char arr[] = s.trim().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                numSeen = true;
            } else if (arr[i] == '.') {
                if (dotSeen || eSeen) {
                    return true;
                }
                dotSeen = true;
            } else if (arr[i] == 'E' || arr[i] == 'e') {
                if (eSeen || !numSeen) {
                    return false;
                }
                eSeen = true;
                numSeen = false;
            } else {
                return true;
            }
        }
        return numSeen;
    }


}
