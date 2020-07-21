package demo20200721;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by zhangzewen on 2020/7/21
 */
public class test2 {

    public static String frequencySort(String s) {
        //初始化字母数组
        int[] latters = new int[256];
        //填充数组
        for (char c : s.toCharArray()) {
            latters[c]++;
        }
        //排序
        PriorityQueue<Latter> queue = new PriorityQueue<>();

        for (int i = 0; i < latters.length; i++) {
            if (latters[i] != 0) {
                queue.add(new Latter((char) i, latters[i]));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()) {
            Latter latter = queue.poll();
            for (int i = 0; i < latter.count; i++)
                stringBuilder.append(latter.latter);
        }


        return stringBuilder.reverse().toString();
    }

    public static class Latter implements Comparable<Latter> {
        public char latter = '0';
        public int count = 0;

        public Latter(char latter, int count) {
            this.latter = latter;
            this.count = count;
        }

        @Override
        public int compareTo(Latter o) {
            if (o.count == this.count) {
                return o.latter - this.latter;
            } else {
                return o.count - this.count;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = frequencySort(s);
        System.out.println(s1);

    }


}
