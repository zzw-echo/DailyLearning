package demo.demo0802;

import java.util.Arrays;
import java.util.Scanner;

public class 猿辅导_重复课程问题 {
    public static void main(String[] args) {

        //start 键盘输入================================================================
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        //end 键盘输入================================================================

        Arrays.sort(start);
        Arrays.sort(end);

        int i=0, j=0, k=0, res=0;

        while (i<n){
            if (start[i] < end[j]){
                //说明此时有开课
                k++;
                i++;
                res = Math.max(k,res);
            }else {
                j++;
                k--;
            }
        }

        System.out.println(res);


    }

}
