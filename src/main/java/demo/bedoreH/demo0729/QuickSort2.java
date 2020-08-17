/**
 * Created by zhangzewen on 2020/7/29
 */
public class QuickSort2 {

    private static void QuickSort(int[] nums, int left, int right){
        if (left >= right)  return;

        int key = nums[left];
        int i = left;
        int j = right;

        while (i<j){
            while (nums[j]>=key && i<j){
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

        if (i != j ) System.out.println("!=======");

        key = key ^ nums[i];

    }



}















