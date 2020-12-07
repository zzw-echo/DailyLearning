package demo.bedoreH.demo0927;



import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/27 19:28
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int qTime = sc.nextInt();

        int[] arr = new int[len];
        int[] quit = new int[qTime];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < qTime; i++) {
            quit[i] = sc.nextInt();
        }


        int temp;
        int distence;
        int minDistence;
        int res = 0;
        for (int i = 0; i < qTime; i++) {
            temp = quit[i];
            minDistence  = Math.abs(temp - arr[0]);
            for (int j = len-1; j >=0; j++) {

                distence = Math.abs(temp - arr[j]);
                if (j==0){
                    res = arr[j];
                    minDistence = distence;
                }

                if (distence < minDistence){
                    minDistence = distence;
                    res = arr[j];
                }
            }
            System.out.println(res);
        }
    }
}
