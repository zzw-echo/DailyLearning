package demo.bedoreH.demo0806.test2;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 13:20
 * @ Description：
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        //nums[i] = nums[nums[i] - 1]  ==>  nums[i] = i + 1
        //1、置换
        //2、hash
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != i + 1) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            //hash
            if (nums[i] <= n) {
                nums[nums[i] - 1] = -Math.abs(nums[nums[i] - 1]);
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
