package demo.bedoreH.demo0813;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/14 14:23
 * 描述 ：
 */
public class demo6 {


    public static void main(String[] args) {
        int[] arr = {2,5,2,7};
        boolean flag = judgePoint24(arr);
        System.out.println(flag);
    }


    public static boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<Double>();
        for (int num : nums) {
            list.add((double) num);
        }
        return solve(list);
    }

    /**
     * @description 回溯法，从数组中选出两个数，把运算结果加到数组中
     */
    private static boolean solve(List<Double> list) {
        if (list.size() == 1) {//数组中只剩下一个数的时候判断结果
            return Math.abs(list.get(0) - 24) < 1e-6;//看是否与24相等
        }
        //从list中取出两个数，把结果放入数组中
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {//取不同的两个数
                    //如果回溯的话，还要恢复现场，把数插回原位置，所以不如直接生成一个新数组
                    List<Double> nums = new ArrayList<Double>();
                    for (int k = 0; k < list.size(); k++) {
                        if (k != i && k != j) {//把剩下的数加入到新数组
                            nums.add(list.get(k));
                        }
                    }
                    Set<Double> doubles = calculate(list.get(i), list.get(j));//获取两个数运算的结果集
                    for (Double aDouble : doubles) {
                        nums.add(aDouble);//把两个数运算的结果，分别加入到新数组中
                        if (solve(nums)) {//找到一个结果，立即返回
                            return true;
                        }
                        nums.remove(nums.size() - 1);//恢复现场
                    }
                }
            }
        }
        return false;//如果没有找到结果，返回false
    }

    /**
     * @description 返回两个数计算得到的结果集
     */
    private static Set<Double> calculate(double a, double b) {
        Set<Double> res = new HashSet<Double>();
        res.add(a - b);
        res.add(b - a);
        res.add(a + b);
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
