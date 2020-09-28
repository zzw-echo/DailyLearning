package demo.bedoreH.demo0816;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/16 15:28
 * 描述 ：
 */
public class demo1 {

    public static int CalulateMethodCount(int num_money) {
        // write code here
        if (num_money == 0 || num_money == 1) return 1;
        return (int) Math.pow(2, num_money - 1);



//        if (num_money <= 0 )    return 0;
//        return (int)Math.pow(2,num_money-1);

//        if (num_money == 1) {
//            return 1;
//        }
//        int preSum = 1;
//        int pre = 0;
//        for (int i = 2; i <= num_money; i++) {
//            pre = preSum + 1;
//            preSum = pre + preSum;
//        }
//        return pre;

//        if (num_money == 1 || num_money == 0){
//            return 1;
//        }
//        return CalulateMethodCount(num_money-1)*2;


    }

    public static void main(String[] args) {
        int a = CalulateMethodCount(2);
        System.out.println(a);
    }


}
