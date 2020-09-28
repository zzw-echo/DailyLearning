package demo.bedoreH.demo0906;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/7 15:16
 */
public class demo2 {


    public static void main(String[] args) {
        int result = test1(9, "ababababc");
        System.out.println(result);
    }


    private static int test1(int len, String str) {

        char[] chars = str.toCharArray();
        int count = 0;
        int temp = count;

        int half = len / 2;

        for (int i = 0; i < half; i++) {
            if (chars[i] == chars[0]) {
                for (int j = 0; j < i; j++) {
                    if (chars[j] != chars[j + i]) {
                        break;
                    }
                }
                count = i;
            }
        }
        return len - count + 1;
    }

}
