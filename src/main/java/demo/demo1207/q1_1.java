package demo.demo1207;

import java.util.HashMap;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/12/7 13:54
 */
public class q1_1 {
    public int[] towSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{
                        hashMap.get(target - nums[i]),
                        i
                };
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
