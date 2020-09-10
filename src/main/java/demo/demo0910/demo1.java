package demo.demo0910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/10 19:32
 */
public class demo1 {
    public List<List<Integer>> threeS(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        Arrays.sort(nums);
        List<Integer> list;
        for (int i = 0; i < nums.length - 2; i++) {
            //跳过重复的数字
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                //从剩下的数组中，找到和为-nums[i]的两个数，可能存在多组
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        //符合条件，保存到结果中
                        list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        //若数字重复，则跳过
                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
