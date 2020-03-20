package others;

/**
 * Created by zhangzewen on 2020/3/16
 * <p>
 * 大小为m，n 的有序数组
 * 找出两个有序数组的中位数，要求时间复杂度O(log(m + n))
 */
public class 寻找两个有序数组的中位数 {


    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        //保证num1是两个数组中元素比较少的那个
        if (num1.length > num2.length) {
            int[] temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int min = 0;
        int max = num1.length;
        int half = (num1.length + num2.length + 1) / 2;

        while (min <= max) {
            int i = (min + max) / 2;
            int j = half - i;

            if (i < max && num1[i] < num2[j-1]){
                min = i+1;
            }else if (i > min && num1[i-1] > num2[j]){
                max = i-1;
            }else {
                //中位数将数组一分为二
                //左半部分最大值
                int maxLeft;
                if (i == 0){
                    maxLeft = num2[j-1];
                }else if (j == 0){
                    maxLeft = num1[i-1];
                }else {
                    maxLeft = Math.max(num1[i-1],num2[j-1]);
                }

                if ((num1.length + num2.length) % 2 == 1){
                    return maxLeft;
                }

                //右半部分最小值
                int minRight;
                if (i == num1.length){
                    minRight = num2[j];
                }else if (j == num2.length){
                    minRight = num1[i];
                }else {
                    minRight = Math.min(num1[i], num2[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }

        }
        return 0.0;

    }

}
