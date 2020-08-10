/**
 * Created by zhangzewen on 2020/7/29
 */
public class QuickSort {

    private static void QuickSort(int[] arr, int left, int right) {

        if (left >= right) return;

        int key = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            arr[i] = arr[j];
            i++;
            while (i < j && key >= arr[i]) {
                i++;
            }
            arr[j] = arr[i];
            j--;
        }
        arr[i] = key;
        QuickSort(arr, left, i - 1);
        QuickSort(arr, i + 1, right);
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 2, 6, 7, 2, 9, 1, 11, 2};
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();

        QuickSort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + "\t");
        }

    }


}

















