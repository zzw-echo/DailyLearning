package demo.demo0813;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/13 19:54
 * 描述 ：
 */
public class demo3 {

    private static int sum = 1024;
    private static int n = 4;
    private static int[] min = new int[sum+1];
    private static int[] coin = {1,4,16,64};

    private static void init(){
        for (int i = 0; i < sum; i++) {
            min[i] = 100000;
        }
    }

    private static void findmin(){
        for (int i = 0; i < sum; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=coin[j]){
                    if (min[i-coin[j]]+1 < min[i]){
                        min[i] = min[i-coin[j]]+1;
                    }
                }
            }
        }
    }

    public int GetCoinCount (int N) {
        // write code here
        init();
        findmin();
        return min[sum-N];
    }
}
