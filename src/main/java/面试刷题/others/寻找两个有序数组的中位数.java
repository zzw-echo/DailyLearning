package others;

/**
 * Created by zhangzewen on 2020/3/16
 * <p>
 * 大小为m，n 的有序数组
 * 找出两个有序数组的中位数，要求时间复杂度O(log(m + n))
 */
public class 寻找两个有序数组的中位数 {

    public int findMedianFromSortedArray(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;
        //如果长度和为奇数，则中位数为(n + m)/2 + 1
        int len = (n + m) / 2 + 1;
        if ((n + m) / 2 == 1) {
            return findk(num1, num2, 0, 0, len);
        } else {
            return (findk(num1, num2, 0, 0, len - 1) + findk(num1, num2, 0, 0, len)) / 2;
        }
    }

    public static int findk(int[] A, int[] B, int i, int j, int len) {
        if (i >= A.length) return B[j + len - 1];
        if (j >= B.length) return A[i + len - 1];
        //退出情况
        if (len == 1) return Math.min(A[i], B[j]);

        int A_key = i + len / 2 - 1 < A.length ? A[i + len / 2 - 1] : Integer.MAX_VALUE;
        int B_key = j + len / 2 - 1 < B.length ? B[j + len / 2 - 1] : Integer.MAX_VALUE;

        if (A_key < B_key) {
            return findk(A, B, i + len / 2, j, len - len / 2);
        } else {
            return findk(A, B, i, j + len / 2, len - len / 2);
        }


    }


}
