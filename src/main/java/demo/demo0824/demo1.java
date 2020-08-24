package demo.demo0824;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/24 10:00
 */
public class demo1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        matrixSpiral(arr);
    }

    public static void matrixSpiral(int[][] matrix) {
        int r0 = 0;
        int c0 = 0;
        int r1 = matrix.length - 1;
        int c1 = matrix[0].length - 1;
        while (r0 <= r1 && c0 <= c1) {
            printMatrix(matrix, r0++, c0++, r1--, c1--);
        }
    }

    private static void printMatrix(int[][] matrix, int r0, int c0, int r1, int c1) {

        if (r0 == r1) {
            for (int i = c0; i <= c1; i++) {
                System.out.print(matrix[r0][i] + " ");
            }
        }
        if (c0 == c1) {
            for (int i = r0; i <= r1; i++) {
                System.out.print(matrix[i][c0]);
            }
        } else {
            int curR = r0;
            int curC = c0;
            while (curC != c1) {
                System.out.print(matrix[r0][curC++] + " ");
            }
            while (curR != r1) {
                System.out.print(matrix[curR++][c1] + " ");
            }
            while (curC != c0) {
                System.out.print(matrix[r1][curC--] + " ");
            }
            while (curR != r0) {
                System.out.print(matrix[curR--][c0] + " ");
            }
        }


    }


}
