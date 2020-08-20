package demo.bedoreH.demo0801;

import java.util.Scanner;

public class 背包问题 {
    public static void main(String[] args) {
        //定义一个数组a[i][j] = a[i]                 i表示当前物品的序号选上，j表示这个位置能得到的最大值
        //选或者不选动态规划
        Scanner scn = new Scanner(System.in);
        int[] w = new int[6];//表示每件物品的重量
        int[] v = new int[6];//表示每件物品的价值
        for (int i = 1; i < 6; i++) {
            w[i] = scn.nextInt();//输入重量
            v[i] = scn.nextInt();//输入价值
        }

        int[][] temp = new int[6][9];   //8表示背包最多能放8公斤的重量
        for (int j = 0; j < 9; j++) {  //初始化每一行
            temp[0][j] = 0;
        }
        for (int i = 1; i < 6; i++) {  //背包的重量为0的时候，最大价值肯定是0
            temp[i][0] = 0;
        }

        for (int i = 1; i < 6; i++) {  //从第一个物品开始选，记录我选了前面出现的物品，背包重量从1-8的能选上的最大的值
            for (int j = 1; j < 9; j++) { //当i循环到最后一层5的时候，也就是得到了，我5件物品都选上的时候的最大的值
                if (w[i] <= j) { //重量比这个状态小，那么就能放。 那么就只是放与不放，看是放重量大，还是不放重量大
                    temp[i][j] = Math.max(temp[i - 1][j], temp[i - 1][j - w[i]] + v[i]);
                } else {
                    temp[i][j] = temp[i - 1][j];//第i件物品不能放
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%-5d", temp[i][j]);
            }
            System.out.println();
        }
    }
}
