package demo.demo0909;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/9 20:52
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(uglyNum(n));
    }

    public static int uglyNum(int n) {
        HashSet<Long> s = new HashSet<>();
        PriorityQueue<Long> h = new PriorityQueue<Long>();
        s.add(1L);
        h.add(1L);
        Long cur = 1L;
        Long newUgly;
        int[] factors = {2, 3, 5};
        for (int i = 0; i < n; i++) {
            cur = h.poll();
            for (int fac : factors) {
                newUgly = cur * fac;
                if (!s.contains(newUgly)) {
                    s.add(newUgly);
                    h.add(newUgly);
                }
            }
        }
        return cur.intValue();
    }


}
