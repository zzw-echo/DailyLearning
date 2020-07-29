/**
 * Created by zhangzewen on 2020/7/29
 */
public class QuickSort1 {

    private static void QuickSort(int[] nums, int left, int right){

        if (left >= right){
            return;
        }
        int key = nums[left];

        int i = left;
        int j = right;

        while (i<j){
            while (nums[j] >= key && i<j){
                j--;
            }
            while (nums[i] <= key && i<j){
                i++;
            }
            if (i<j){
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[i] ^ nums[j];
                nums[i] = nums[i] ^ nums[j];
            }
        }
        nums[i] = nums[i] ^ nums[left];
        nums[left] = nums[i] ^ nums[left];
        nums[i] = nums[i] ^ nums[left];

        QuickSort(nums, left, i-1);
        QuickSort(nums, i+1, right);

    }

    public static void main(String[] args) {
        int[] nums = {3,5,6,7,9,1,11,2};
        for (int num : nums){
            System.out.print(num + "\t");
        }
        System.out.println();

        QuickSort(nums,0, nums.length-1);
        for (int num : nums){
            System.out.print(num + "\t");
        }

    }



}
















