package demo.demo0807.test2.Q;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/7 18:50
 * @ Description：快排
 */
public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;

        int key = arr[low];

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
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        int k;

        if (low < high) {
            k = partition(arr, low, high);
            quickSort(arr, low, k - 1);
            quickSort(arr, k + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        quickSort(arr, 0, arr.length - 1);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

    //插排、聚类、尾递归、多线程
}
