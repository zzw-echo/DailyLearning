package demo.bedoreH.demo1006.qs;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/10/6 21:58
 */
public class demo1 {

    private static int partition(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= key) {
                high--;
            }
            if (low < high) {
                arr[low] = arr[high];
                low++;
            }
            while (low < high && arr[low] <= key) {
                low++;
            }
            if (low < high) {
                arr[high] = arr[low];
                high--;
            }
        }
        arr[low] = key;
        return low;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int key = partition(arr, low, high);
            quickSort(arr, low, key - 1);
            quickSort(arr, key + 1, high);
        }
    }

}
