package demo.bedoreH.demo0813;

import java.util.ArrayList;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/14 14:20
 * 描述 ：
 */
public class demo5 {

    public static void main(String[] args) {
        int[] arr = {2,5,2,7};
        boolean flag = judgePoint24(arr);
        System.out.println(flag);
    }


    public static boolean judgePoint24(int[] nums) {
        ArrayList list = new ArrayList<Double>();
        for (int v : nums) list.add((double) v);
        return solve(list);
    }

    private static boolean solve(ArrayList<Double> list) {
        if (list.size() == 0) return false;
        if (list.size() == 1) return Math.abs(list.get(0) - 24) < 1e-6;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    ArrayList<Double> nums2 = new ArrayList<Double>();
                    for (int k = 0; k < list.size(); k++)
                        if (k != i && k != j) {
                            nums2.add(list.get(k));
                        }
                    for (int k = 0; k < 4; k++) {
                        if (k < 2 && j > i) continue;
                        if (k == 0) nums2.add(list.get(i) + list.get(j));
                        if (k == 1) nums2.add(list.get(i) * list.get(j));
                        if (k == 2) nums2.add(list.get(i) - list.get(j));
                        if (k == 3) {
                            if (list.get(j) != 0) {
                                nums2.add(list.get(i) / list.get(j));
                            } else {
                                continue;
                            }
                        }
                        if (solve(nums2)) return true;
                        nums2.remove(nums2.size() - 1);
                    }
                }
            }
        }
        return false;
    }
}


