package demo.bedoreH.demo0824;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/24 9:55
 */
public class PrintMatrixSpiralOrder {
        public static void main(String[] args) {
            int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            printMatrixSpiralOrder(arr);
        }

        public static void printMatrixSpiralOrder(int[][] matrix) {
            int r0 = 0;//起始点的行位置。
            int c0 = 0;//起始点的列位置。
            int r1 = matrix.length-1;//末尾点的行位置。
            int c1 = matrix[0].length-1;//末尾点的列位置。
            while(r0<=r1 && c0<=c1){//打印结束标志。
                printCircle(matrix,r0++,c0++,r1--,c1--);//向下移位。
            }
        }

        public static void printCircle(int[][] matrix,int r1,int c1,int r2,int c2 ) {
            if(r1==r2){//数据只是一列时。
                for(int i = c1;i<=c2;i++){
                    System.out.print(matrix[r1][i]+" ");
                }
            }
            else if(c1==c2){//数据只是一行时。
                for(int i = r1;r1<=r2;i++){
                    System.out.print(matrix[i][c1]+" ");
                }
            }else{
                int curR = r1;
                int curC = c1;
                while(curC!=c2){//到达右上边界停止
                    System.out.print(matrix[r1][curC++]+" ");
                }
                while(curR!=r2){//到达右下边界停止。
                    System.out.print(matrix[curR++][c2]+" ");
                }
                while(curC!=c1){//到达左下边界停止。
                    System.out.print(matrix[r2][curC--]+" ");
                }
                while(curR!=r1){//到达左上方边界停止。
                    System.out.print(matrix[curR--][c1]+" ");
                }
            }
        }
    }


