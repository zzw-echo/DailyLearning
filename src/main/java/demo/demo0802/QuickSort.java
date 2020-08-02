package demo.demo0802;

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
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
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        quickSort(arr, 0, arr.length - 1);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

    }


}
