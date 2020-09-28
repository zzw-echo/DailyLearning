package demo.bedoreH.demo0815;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/15 14:56
 * 描述 ：
 */
public class demo11 {

    public static void main(String[] args) {
        int[] arr = {2,5,2,8};
        boolean flag = is24(arr);
        System.out.println(flag);
    }

    private static boolean is24(int[] arr) {
        ArrayList<Double> list = new ArrayList<>();
        for (int a :
                arr) {
            list.add((double) a);
        }
        boolean flag = solve(list);
        return flag;
    }

    private static boolean solve(ArrayList<Double> list) {

        if (list.size() == 0) {
            return false;
        }
        if (list.size() == 1) {
            return Math.abs(list.get(0) - 24) < 1e-6;
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    ArrayList<Double> listNext = new ArrayList<>();
                    for (int k = 0; k < list.size(); k++) {
                        if (k != i && k != j) {
                            listNext.add(list.get(k));
                        }
                    }
                    Set<Double> cals = cals(list.get(i), list.get(j));
                    for (Double cal : cals) {
                        listNext.add(cal);
                        if (solve(listNext)) {
                            return true;
                        }
                        listNext.remove(listNext.size() - 1);
                    }
                }
            }
        }
        return false;
    }

    private static Set<Double> cals(Double a, Double b) {
        HashSet<Double> cals = new HashSet<>();
        cals.add(a + b);
        cals.add(a - b);
        cals.add(b - a);
        cals.add(a * b);
        if (a != 0) {
            cals.add(b / a);
        }
        if (b != 0) {
            cals.add(a / b);
        }
        return cals;
    }


}
