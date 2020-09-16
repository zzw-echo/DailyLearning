package demo.demo0916;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/16 8:55
 */
public class demo1 {

    public static void main(String[] args) {
        Integer[] arr = {1,2,1,2,2,3,4,5};
        Integer[] integers = deDup(arr);
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
        }
    }

    public Integer[] deDup3(Integer[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        return set.toArray(new Integer[set.size()]);
    }

    public static Integer[] deDup(Integer[] arr){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.toArray(new Integer[0]);
    }

}
