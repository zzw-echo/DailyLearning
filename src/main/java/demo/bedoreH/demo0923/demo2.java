package demo.bedoreH.demo0923;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/24 15:55
 */

public class demo2 {

    static char[] ENC_ARRAY = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0', '+', '-'};

    public static String encode(String srcStr) {
        // write code here
        char[] chars = srcStr.toCharArray();
        List resList = new ArrayList();
        int i = 0;
        char c1, c2, c3;
        int len = srcStr.length();
        while (i < len) {
            c1 = chars[i++];
            if (i == len) {
                resList.add(ENC_ARRAY[c1 >> 2]);
                resList.add(ENC_ARRAY[(c1 & 0x3) << 4]);
                resList.add('$');
                resList.add('$');
                break;
            }
            c2 = chars[i++];
            if (i == len) {
                resList.add(ENC_ARRAY[c1 >> 2]);
                resList.add(ENC_ARRAY[((c1 & 0x03) << 4 | (c2 >> 4))]);
                resList.add(ENC_ARRAY[((c2 & 0x0f) << 2)]);
                resList.add('$');
                break;
            }
            c3 = chars[i++];
            resList.add(ENC_ARRAY[c1 >> 2]);
            resList.add(ENC_ARRAY[((c1 & 0x03) << 4 | (c2 >> 4))]);
            resList.add(ENC_ARRAY[((c2 & 0x0f) << 2)|(c3>>6)]);
            resList.add(ENC_ARRAY[c3&0x3f]);
        }
        String resString= "";
        for (int j = 0; j < resList.size(); j++) {
            resString += resList.get(j);
        }
        return resString;
    }


    public static void main(String[] args) {
        String a = encode("A");
        System.out.println(a);
    }
}
