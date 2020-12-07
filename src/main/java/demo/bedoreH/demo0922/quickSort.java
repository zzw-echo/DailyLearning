package demo.bedoreH.demo0922;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/22 23:44
 */
public class quickSort {

    private static int partition(int[] arr, int low, int high) {
        int key = arr[low];

        int i = low;
        int j = high;

        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j) {
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


}
