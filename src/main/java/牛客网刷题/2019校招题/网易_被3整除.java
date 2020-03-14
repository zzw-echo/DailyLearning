/**
 * Created by zhangzewen on 2020/3/14
 */
public class 网易_被3整除 {

    public static int divide(int l, int r) {
        int count = 0;
        int intl = 0;
        StringBuilder sbl = new StringBuilder("");
        StringBuilder sbr = new StringBuilder("");
        for (int i = 1; i <= r; i++) {
            if (i < l) {
                sbl.append(i);
            }
            if (i >= l) {
                sbr = sbl;
                sbr.append(i);
                intl = Integer.parseInt(sbl.toString());
                if (intl % 3 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        divide(2, 5);
    }

}
