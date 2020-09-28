package demo.bedoreH.demo0912;

import java.util.Stack;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/12 20:36
 */
public class demo2 {

    public static void main(String[] args) {

        int[][] matr = new int[9][9];
        int[][] move = {{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
        Stack s = new Stack();
        Stack s1 = new Stack();

        int a = path(matr, move, s,0,0,0,7);

        int count = 0;

        while (!s.isEmpty()){
            count++;
            s.pop();
        }
    }

    public static int path(int[][] matr, int[][] move, Stack<Step> s,int x0, int y0, int x1, int y1) {
        Step temp = new Step(x0, y0, -1);
        s.push(temp);
        while (!s.isEmpty()) {
            temp = s.pop();
            int x = temp.x;
            int y = temp.y;
            int d = temp.d;
            while (d < 8) {
                int i = x + move[d][0];
                int j = y + move[d][1];
                if (matr[i][j] == 0) {
                    temp = new Step(i, j, d);
                    s.push(temp);
                    x = i;
                    y = j;
                    matr[x][y] = -1;
                    if (x == x1 && y == y1) {
                        return 1;
                    } else {
                        d = 0;
                    }
                } else {
                    d++;
                }
            }

        }
        return 0;

    }


}

class Step {
    int x, y, d;

    public Step(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
}
