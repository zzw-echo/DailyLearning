package demo.demo0730;

/**
 * Created by zhangzewen on 2020/7/30
 */
public class QuickSort {

    private static void QuickSort(int[] arr, int start, int end) {

        if (start >= end) return;

        int key = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && key <= arr[end]) {
                j--;
            }
            if (i >= j) {
                break;
            } else {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && key >= arr[start]) {
                i++;
            }
            if (i >= j) {
                break;
            } else {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = key;
        QuickSort(arr, start, i - 1);
        QuickSort(arr, i + 1, end);
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
