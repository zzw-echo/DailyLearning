package demo.demo0820;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/20 20:12
 */
public class demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int count = 0;
        int temp = -1;
        int tempNum = -1;

        int[] hasRent = new int[n];
        for (int i = 0; i < n; i++) {
            hasRent[i] = 0;
        }
        int[] hasRec = new int[m];
        for (int i = 0; i < m; i++) {
            hasRec[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[j] <= a[i] && c[j] >=temp && hasRec[j] == 0){
                    if (tempNum>=0){
                        hasRec[tempNum] = 0;
                        count -= temp;
                    }
                    hasRec[j] = 1;
                    tempNum = j;
                    temp = c[j];
                    count += c[j];
                }
            }
            temp = -1;
            tempNum = -1;
        }
        System.out.println(count);
    }

}
