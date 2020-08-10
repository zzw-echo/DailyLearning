package demo.draft.demo0802;

import java.util.Comparator;
import java.util.PriorityQueue;

public class test1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(7, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int[] arr = {9, 3, 8, 1, 2, 4, 7};

        for (Integer integer: arr){
            pq.offer(integer);
        }



        Integer temp = pq.peek();
        temp = null;
        System.out.println(pq);


    }


}
