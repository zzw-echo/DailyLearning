package demo.demo0801;

import java.util.Scanner;

public class 背包问题2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        int res = maxValue(n, target, weight, value);
        System.out.println(res);
    }

    public static int maxValue(int n, int target, int[] w, int[] v) {
        int[][] arr = new int[n][target + 1];
        for (int i = 0; i <= target; i++) {
            if (i >= w[0]) {
                arr[0][i] = v[0];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= target; j++) {
                if (j < w[i])
                    arr[i][j] = arr[i - 1][j];
                else
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - w[i]] + v[i]);
            }
        }
        return arr[n - 1][target];
    }
}




