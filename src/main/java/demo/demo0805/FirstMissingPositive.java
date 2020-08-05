package demo.demo0805;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 18:59
 * @ Description：
 */
public class FirstMissingPositive {

    /*
    nums[0] = 1;
    nums[1] = 3 ;  2

    nums[i] = i + 1;

     */


    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] > 0 && nums[i] <= len && nums[i] != i + 1) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return len+1;

        //nums[i] = x < n   nums[x-1] = -nums[x-1]  负数就是存在，最小非负

       /* int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) nums[i] = n + 1;
        }
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (x <= n){
                nums[x-1] = -Math.abs(nums[x-1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0 ){
                return i+1;
            }
        }
        return n+1;*/


    }

}
