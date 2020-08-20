package demo.bedoreH.demo0803;

import java.util.*;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/3 10:36
 * @ Description：求数组中最小的k个数
 */
public class LeastNums {

    private static ArrayList leastNums(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        if (arr.length < k) {
            for (int num : arr) {
                result.add(num);
            }
            return result;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < arr.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(arr[i]);
            } else if (priorityQueue.peek() > arr[i]) {
                priorityQueue.poll();
                priorityQueue.offer(arr[i]);
            }
        }

        for (Integer integer : priorityQueue) {
            result.add(integer);
        }


        return result;
    }


    public static void main(String[] args) {
//        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8, 9, 9, 1, 1};
//        ArrayList<Integer> result = leastNums(arr, 4);
//        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}


