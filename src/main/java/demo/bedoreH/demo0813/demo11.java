package demo.bedoreH.demo0813;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/14 20:28
 * 描述 ： 24点
 */
public class demo11 {

    public static boolean judgePoint24(int[] nums) {
        ArrayList<Double> list = new ArrayList<>();
        for (int n : nums) {
            list.add((double) n);
        }
        return solve(list);
    }

    //从数组中选2个数，把运算结果加到数组中
    private static boolean solve(ArrayList<Double> list) {
        if (list.size() == 0) return false;
        if (list.size() == 1) return Math.abs(list.get(0) - 24) < 1e-6;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
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
