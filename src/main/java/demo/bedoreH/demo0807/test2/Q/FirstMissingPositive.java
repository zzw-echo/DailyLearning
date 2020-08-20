package demo.bedoreH.demo0807.test2.Q;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 13:16
 * @ Description：
 */
public class FirstMissingPositive {

    //1、置换
    //2、hash
    //[1,n+1]
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
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
