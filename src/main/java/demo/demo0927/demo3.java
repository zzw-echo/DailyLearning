package demo.demo0927;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/27 19:59
 */
public class demo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        if (len < 3){
            System.out.println(0);
            return;
        }
        if (len == 3){
            System.out.println(1);
            
            return;
        }

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int i,j,k;

        int count = 0;
        for ( i = 0; i < len; i++) {
            for ( j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    continue;
                }

                for ( k = j + 1; k < len; k++) {
                    if (arr[j] > arr[k]) {
                        continue;
                    }
                    if (arr[i] <= arr[j] && arr[j] <= arr[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
