package demo.demo0802;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 最小的k个数 {

    private static ArrayList<Integer> GetLeastNum(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int len = input.length;
        if (k > len || k == 0) return result;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < len; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8, 9, 9, 1};
        ArrayList<Integer> result = GetLeastNum(arr, 4);
        System.out.println(result);
    }

}
