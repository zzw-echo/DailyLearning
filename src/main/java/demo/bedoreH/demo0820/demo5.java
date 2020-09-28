package demo.bedoreH.demo0820;

import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/23 16:46
 */
public class demo5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nl = sc.nextLine();
        String[] ss = nl.split(" ");

        int[] xArr = new int[ss.length / 2];
        int[] yArr = new int[ss.length / 2];

        for (int i = 0, j = 0; i < ss.length / 2; ) {
            xArr[i] = Integer.parseInt(ss[j]);
            j++;
            yArr[i] = Integer.parseInt(ss[j]);
            j++;
            i++;
        }
        


    }

}
