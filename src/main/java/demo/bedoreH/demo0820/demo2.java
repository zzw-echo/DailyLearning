package demo.bedoreH.demo0820;

import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/20 20:12
 */
public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int[] R = new int[n];
        int[] W = new int[n];
        int[] pre = new int[n];
        int[] M = new int[n];
        boolean[] flag = new boolean[n];

        for (int i = 0; i < n; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            W[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            pre[i] = 0;
            M[i] = 0;
            flag[i] = false;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (R[j] <= L[i]) {
                    pre[i] = Math.max(pre[i], j);
                }
            }
        }
        int result = fib(n-1, L, R, W, pre, M, flag);
        System.out.println(result);

    }

    public static int fib(int n, int[] L, int[] R, int[] W, int[] pre, int[] M, boolean[] flag) {
        if (n == -1) {
            return 0;
        }
        if (M[n] >= 0
                && flag[n] == true)
            return M[n];
        flag[n] = true;
        return M[n] = Math.max(fib(n - 1, L, R, W, pre, M, flag), W[n] + fib(pre[n], L, R, W, pre, M, flag));
    }

}
