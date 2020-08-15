package demo.demo0813;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/14 20:54
 * 描述 ：
 */
public class demo12 {


    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8};
        boolean flag = judgePoint24(arr);
        System.out.println(flag);
        for (Double d :
                resList) {
            System.out.print(d + " ");
        }
    }

    private static ArrayList<Double> resList = new ArrayList<>();


    public static boolean judgePoint24(int[] arr) {
        ArrayList<Double> list = new ArrayList<>();
        for (int a : arr) {
            list.add((double) a);
        }
        return solve(list);
    }

    private static boolean solve(List<Double> list) {
        if (list.size() == 0) return false;
        if (list.size() == 1) return Math.abs(list.get(0) - 24) < 1e-6;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    ArrayList<Double> listNext = new ArrayList<>();
                    for (int k = 0; k < list.size(); k++) {
                        if (k != i && k != j) {
                            listNext.add(list.get(k));
                        }
                    }
                    resList.add(list.get(i));
                    resList.add(list.get(j));
                    Set<Double> cals = cals(list.get(i), list.get(j));

                    for (Double cal : cals) {
                        listNext.add(cal);
                        if (solve(listNext)) {
                            return true;
                        }
                        listNext.remove(listNext.size() - 1);
                    }

                    resList.remove(resList.size() - 1);
                    resList.remove(resList.size() - 1);
                }
            }
        }
        return false;
    }

    private static Set<Double> cals(Double a, Double b) {
        HashSet<Double> res = new HashSet<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (a != 0) {
            res.add(b / a);
        }
        if (b != 0) {
            res.add(a / b);
        }
        return res;
    }


}
