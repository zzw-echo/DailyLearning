package demo.demo0927;

import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/27 20:26
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() % 4;
        int y = sc.nextInt() % 2;
        int z = sc.nextInt() % 4;

        int m = sc.nextInt();
        int n = sc.nextInt();
        int len = sc.nextInt();
        int[][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        int step = 0;
        if (y == 0) {
            step = (z - x) % 4;
        } else if (y == 1) {
            if (x == 0) {
                z += 3;
            } else if (x == 2) {
                z++;
            } else if (x == 3) {
                z += 2;
            }
            step = z % 4;
        }

        for (int i = 0; i < len; i++) {
            int tempX = arr[i][0];
            int tempY = arr[i][1];
            if (step == 1) {
                tempX = m - tempX + 1;
            } else if (step == 2) {
                tempX = m - tempX + 1;
                tempY = n - tempY + 1;
            } else if (step == 3) {
                tempY = n - tempY + 1;
            }
            System.out.print(tempX + " ");
            System.out.print(tempY);
            System.out.println();
        }


    }
}
