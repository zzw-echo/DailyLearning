package demo.bedoreH.demo0909;

import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/9 21:22
 */
public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String SIn = scanner.nextLine();
        scanner.close();

        String[] strings = SIn.split(",");
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(rb(arr));
    }

    private static int rb(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return arr[0];
        }
        int[] dp = new int[len];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        }
        return dp[len - 1];
    }
}
