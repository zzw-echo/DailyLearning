package demo.bedoreH.demo0923;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/24 15:44
 */
public class demo1 {

    public static String sortVersion(String versions) {
        // write code here
        String[] strings = versions.split(" ");
        List<String> list = Arrays.asList(strings);
        Collections.sort(list,Collections.reverseOrder());
        return list.toString();
    }

    public static void main(String[] args) {
        String aa = "2.x 3.1.x 3.0 2.y 4.x.y";
        aa = sortVersion(aa);
        System.out.println(aa);
    }
}
