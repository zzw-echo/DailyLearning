package demo.demo0810;

import java.util.Scanner;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/10 19:07
 * @ Description：
 */
public class demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int len = arr[n - 1];

        double[] dist = new double[len];

        for (int i = 0; i < len; i++) {
            dist[i] = 0;
            for (int j = 0; j < n; j++) {
                dist[i] += Math.abs(arr[j] - i);
            }
        }
        double result = dist[0];
        int stat = 0;
        int j = 0;
            for (int i = 1; i < len; i++) {
                if (dist[i] < result && i != arr[j]) {
                    result = dist[i];
                    stat = i;
                }
                if (i >= arr[j]){
                    j++;
                }
            }


        System.out.println((int)result);
        System.out.println(stat);
    }


}
