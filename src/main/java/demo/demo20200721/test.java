package demo20200721;

/**
 * Created by zhangzewen on 2020/7/21
 */

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Map<Character, Integer> map = new HashMap<>();
        for (char chr : s.toCharArray()) {
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (e1, e2) -> e1.getValue() - e2.getValue());

        maxHeap.addAll(map.entrySet());

        StringBuilder sortedString = new StringBuilder(s.length());
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                sortedString.append(entry.getKey());
            }
        }
        System.out.println(sortedString.toString());

    }

}
