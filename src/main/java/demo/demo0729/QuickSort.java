/**
 * Created by zhangzewen on 2020/7/29
 */
public class QuickSort {


    public static void QuickSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }
        int key = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (nums[j] >= key && i < j) {
                j--;
            }
            while (nums[i] <= key && i < j) {
                i++;
            }
            if (i < j) {
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[i] ^ nums[j];
                nums[i] = nums[i] ^ nums[j];
            }
        }
        nums[left] = nums[i];
        nums[i] = key;
        QuickSort(nums, left, i - 1);
        QuickSort(nums, i + 1, right);

    }


    public static void main(String[] args) {
        int[] nums = {3, 45, 78, 65, 54, 11, 64, 55, 11, 18};    //快排、选排、希尔、堆排 不稳定
        for (int a : nums) {
            System.out.print(a + "\t");
        }

        System.out.println();

        QuickSort(nums, 0, nums.length-1);
        for (int a : nums) {
            System.out.print(a + "\t");
        }

    }

}

















