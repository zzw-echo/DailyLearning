package demo.demo1004.quickSort;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/10/4 16:24
 */
public class demo1 {

    private static int partition(int[] arr, int i, int j) {
        int key = arr[i];

        while (i < j) {
            while (i < j && key <= arr[j]) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && key >= arr[i]) {
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
        if (low < high) {
            int key = partition(arr, low, high);
            quickSort(arr, low, key - 1);
            quickSort(arr, key + 1, high);
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
