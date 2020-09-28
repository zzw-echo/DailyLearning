package demo.bedoreH.demo0916;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/16 9:23
 */
public class demo2 {

    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "bbb", "ccc","ccc","ccc"};
        String[] strings = deDup(arr);
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }
    }


    public static String[] deDup(String[] arr) {
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        return set.toArray(new String[set.size()]);
    }

}
