package demo.demo0922;

import java.util.Date;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/22 23:33
 */
public class demo1 {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        String strDate =String.format("%tj",date);

        System.out.println(strDate);

        int sum = curDay(2020, 9, 22);
        System.out.println(sum);

    }


    public static int curDay(int year, int month, int day){
        int[] DAY = {
                31,28,31,30,31,30,31,31,30,31,30,31
        };

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            DAY[1] = 29;
        }
        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += DAY[i];
        }
        return sum+day;
    }


}
