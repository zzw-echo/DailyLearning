import java.util.Scanner;

/**
 * Created by zhangzewen on 2020/3/21
 *
 * https://www.nowcoder.com/practice/3a3577b9d3294fb7845b96a9cd2e099c?tpId=98&tqId=32826&tPage=1&rp=1&ru=/ta/2019test&qru=/ta/2019test/question-ranking
 */
public class 网易_安置路灯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (s.charAt(j)=='.'){
                    count++;
                    j+=2;
                }
            }
            System.out.println(count);
        }
    }
}

//2020.03.22 划水的一天，在考虑论文开题
//2020.03.24 今天和两天前一样
//2020.03.25 明天一定要学习！！！
//2020.03.27 今天看了Hadoop视频，大致学习了HDFS和MapReduce（需要尝试一个新的方法记笔记）
//2020.03.28 今天学习Hadoop应用，MapReduce
//2020.03.29 用MapReduce实现了计数操作
//2020.03.31 数据的切片规则
