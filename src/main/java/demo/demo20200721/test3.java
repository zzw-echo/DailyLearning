package demo20200721;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zhangzewen on 2020/7/21
 */
class test3 {

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] dp = new int[n][K+2];
        for(int i = 0; i < n; ++i) Arrays.fill(dp[i], Integer.MAX_VALUE);
        for(int k = 0; k <= K+1; ++k) dp[src][k] = 0;
        for(int k = 1; k <= K+1; ++k) {
            for(int[] flight : flights) {
                if(dp[flight[0]][k-1] != Integer.MAX_VALUE)
                    dp[flight[1]][k] = Math.min(dp[flight[1]][k], dp[flight[0]][k-1] + flight[2]);
            }
        }
        return dp[dst][K+1] == Integer.MAX_VALUE ? -1 : dp[dst][K+1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[n][1];

        String s = sc.nextLine();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            String[] temp = str[i].split(",");
            matrix[i] = StringToInt(temp);
        }
        String s3 = sc.nextLine();
        String[] str3 = s3.split(" ");
        int src = Integer.parseInt(str3[0]);
        int dst = Integer.parseInt(str3[1]);
        int K = Integer.parseInt(str3[2]);
        int a=  findCheapestPrice(n, matrix, src, dst, K);
        System.out.println(a);
    }



    public static int[] StringToInt(String[] arrs){
        int[] ints = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            ints[i] = Integer.parseInt(arrs[i]);
        }
        return ints;
    }



}