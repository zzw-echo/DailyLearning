package demo.demo0813;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/13 19:30
 * 描述 ：
 */
public class demo1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(10);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
    }

    public boolean Game24Points(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            list.remove(i);
            if (getResult(list, temp)) {
                return true;
            }
            list.add(i, temp);
        }
        return false;
    }

    private static boolean getResult(List<Integer> list, int temp) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int n = list.get(i);
                list.remove(i);
                if (getResult(list, temp * n) || getResult(list, temp + n) || getResult(list, temp - n)) {
                    return true;
                } else if (temp % n == 0) {
                    if (getResult(list, temp / n)) {
                        return true;
                    }
                }
                list.add(i, n);
            }
            return false;
        } else {
            if (temp == 24) {
                return true;
            } else {
                return false;
            }
        }
    }
}
