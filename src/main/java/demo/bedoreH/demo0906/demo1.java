package demo.bedoreH.demo0906;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/6 18:13
 */
public class demo1 {


        public static int total = 0;
        public static void swap(String[] str, int i, int j)
        {
            String temp = new String();
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        public static void arrange (String[] str, int st, int len)
        {
            if (st == len - 1)
            {
                for (int i = 0; i < len; i ++)
                {
                    System.out.print(str[i]+ "  ");
                }
                System.out.println();
                total++;
            }
            else
            {
                for (int i = st; i < len; i ++)
                {
                    swap(str, st, i);
                    arrange(str, st + 1, len);
                    swap(str, st, i);
                }
            }
        }
        /**
         * @param args
         */
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            String str[] = {"a","b","c"};
            arrange(str, 0, str.length);
            System.out.println(total);
        }


}
