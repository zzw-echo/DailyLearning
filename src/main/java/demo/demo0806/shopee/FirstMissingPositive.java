package demo.demo0806.shopee;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 11:56
 * @ Description：
 */
public class FirstMissingPositive {

    //1、置换  nums[i] = nums[nums[i] - 1] ==> nums[i] = i + 1
    //2、hash
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != i + 1) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return n + 1;
    }

    //值对应下标 的值 变为负数
    public int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            //hash
            int x = Math.abs(nums[i]);
            if (x <= n) {
                nums[x - 1] = -Math.abs(nums[x - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }


}
