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
