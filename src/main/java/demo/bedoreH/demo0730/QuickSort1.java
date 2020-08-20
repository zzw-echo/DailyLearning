package demo.bedoreH.demo0730;

import java.util.Random;

/**
 * Created by zhangzewen on 2020/7/30
 */
public class QuickSort1 {

    private static void swap(int[] arr, int start, int end) {
//        arr[start] = arr[start] ^ arr[end];
//        arr[end] = arr[start] ^ arr[end];
//        arr[start] = arr[start] ^ arr[end];

//        arr[start]^= arr[end] ^= arr[start] ^= arr[end];

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void randomChoice(int[] arr, int start, int end) {
        Random random = new Random();
        int ranNum = random.nextInt(end - start + 1) + start;
        swap(arr, start, ranNum);
    }

    private static void midTree(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        if (arr[start] > arr[end]) swap(arr, start, end);
        if (arr[mid] > arr[end]) swap(arr, mid, end);
        if (arr[mid] > arr[start]) swap(arr, start, mid);
    }


    //随机选取基准值==============================
    private static void QuickSort(int[] arr, int start, int end) {
        if (start >= end) return;

//        randomChoice(arr,start,end);
        midTree(arr, start, end);


        int key = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            if (i >= j) {
                break;
            } else {
                arr[i] = arr[j];
                i++;
            }

            while (i < j && key >= arr[i]) {
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















