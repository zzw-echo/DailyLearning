package demo.bedoreH.demo0802;

public class 大顶堆 {


    private static void create_heap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            fix_down(arr, i, arr.length - 1);
        }
    }

    private static void fix_down(int[] arr, int i, int end) {
        int child = (i << 2) + 1;
        int temp = arr[i];

        while (child <= end) {
            if (child < end && arr[child + 1] > arr[child]) {
                child++;
            }
            if (temp < arr[child]) {
                arr[i] = arr[child];
                i = child;
                child = (i << 1) + 1;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

    private static void head_sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            fix_down(arr, 0, i - 1);
        }
    }


    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {19, 17, 20, 18, 16, 21};
        create_heap(arr);
        print(arr);
        head_sort(arr);
        print(arr);
    }


}
















