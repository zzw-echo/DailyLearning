package demo.bedoreH.demo0923.other;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 11:18
 */
public class demo11 {
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
        if (low < high) {
            int key = partition(arr, low, high);
            quickSort(arr, low, key - 1);
            quickSort(arr, key + 1, high);
        }
    }


}
