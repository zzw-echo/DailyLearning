package demo.bedoreH.demo0731;

import java.util.Random;

/**
 * Created by zhangzewen on 2020/7/31
 */
public class QuickSort1 {

    private static void QuickSort(int[] arr, int low, int high) {

        if (low >= high) return;

//        ranNum(arr, low, high);
        midThree(arr, low, high);

        int key = arr[low];

        int i = low;
        int j = high;

        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            if (i >= j) {
                break;
            } else {
                arr[i] = arr[j];
            }
            while (i < j && key >= arr[i]) {
                i++;
            }
            if (i >= j) {
                break;
            } else {
                arr[j] = arr[i];
            }
        }

        arr[i] = key;
        QuickSort(arr, low, i - 1);
        QuickSort(arr, i + 1, high);
    }

    private static void ranNum(int[] arr, int low, int high) {
        int rannum = new Random().nextInt(high - low + 1) + low;
        swap(arr, low, rannum);
    }

    private static void midThree(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (arr[low] > arr[high])   swap(arr, low, high);
        if (arr[mid] > arr[high])   swap(arr, mid, high);
        if (arr[mid] > arr[low])    swap(arr, low, mid);
    }


    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
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
