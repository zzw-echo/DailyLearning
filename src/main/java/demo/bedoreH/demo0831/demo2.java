package demo.bedoreH.demo0831;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/31 19:34
 */
public class demo2 {

    public static long nextNarcissisticNumber (int n) {
        // write code here
        n = n+1;
        while(true){

            String s = n+"";
            int len = s.length();
            char[] chars = s.toCharArray();
            int count = 0;
            for (int i = 0; i < len; i++) {
                int temp = chars[i] - '0';
                count += Math.pow(temp, len);
            }
            if (count == n){
                return n;
            }else {
                n += 1;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(nextNarcissisticNumber(108));
    }

}
