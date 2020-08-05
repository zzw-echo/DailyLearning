package demo.demo0805;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 15:17
 * @ Description：
 */
public class demo3 {


    /**
     * @param nums int整型一维数组 入参数组
     * @return int整型
     */
    public int firstMissingPositive(int[] nums) {
        // write code here
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) return j + 1;
        }
        return nums.length + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
