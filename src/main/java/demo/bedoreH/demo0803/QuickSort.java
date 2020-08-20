package demo.bedoreH.demo0803;

public class QuickSort {

    private static int partition(int[] arr, int low, int high) {
        if (low >= high) return -1;

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

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int key = partition(arr, low, high);
            quickSort(arr, low, key - 1);
            quickSort(arr, key + 1, high);
        }
    }

    private static void quickSort2(int[] arr, int low, int high) {
        int key;
        while (low < high) {
            key = partition(arr, low, high);
            quickSort2(arr, low, key - 1);
            low = key + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        quickSort(arr, 0, arr.length - 1);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

}




















