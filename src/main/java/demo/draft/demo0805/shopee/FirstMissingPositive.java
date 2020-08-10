package demo.draft.demo0805.shopee;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 0:16
 * @ Description：
 */
public class FirstMissingPositive {

    //n个数，缺失的第一个正数一定在 1-N+1 之间
    //i + 1 -> nums[i]

    public int firstMissingPositive(int[] nums) {

        //nums[i] = x= < n   nums[x-1] = -nums[x-1]
        /*
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) nums[i] = n + 1;
        }
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (x <= n) {
                nums[x - 1] = -Math.abs(nums[x - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) return i + 1;
        }
        return n + 1;
        */

        //nums[i] != nums[nums[i] - 1]

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
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


}
