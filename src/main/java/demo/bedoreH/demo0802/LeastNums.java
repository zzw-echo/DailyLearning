package demo.bedoreH.demo0802;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeastNums {

    private static ArrayList<Integer> getLeastNum(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int len = arr.length;
        if (k > len || k == 0) return result;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < len; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(arr[i]);
            } else if (maxHeap.peek() > arr[i]) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8, 9, 9, 1};
        ArrayList<Integer> result = getLeastNum(arr, 4);
        System.out.println(result);
    }



}
