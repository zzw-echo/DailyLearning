package demo.bedoreH.demo0820;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/23 16:42
 */
public class MyPoint {


    private double x;  // 横坐标
    private double y;  // 纵坐标

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /*
      lst中含有若干个点的坐标
      返回其中距离最小的点的距离
    */
    public static double getMinDistance(List<MyPoint> lst) {
        if (lst == null || lst.size() < 2) return Double.MAX_VALUE;

        double r = Double.MAX_VALUE;
        MyPoint p0 = lst.remove(0);
        for (int i = 0; i < lst.size(); i++) {
            MyPoint p = lst.get(i);
            double d = MyPoint.distance(p0, p);
            if (d < r) r = d;
        }

        double d2 = getMinDistance(lst);
        return d2 < r ? d2 : r;
    }

    public static void main(String[] args) {
        MyPoint m1 = new MyPoint(0, 0);
        MyPoint m2 = new MyPoint(70, 40);
        MyPoint m3 = new MyPoint(30, 10);
        MyPoint m4 = new MyPoint(10, 5);
        MyPoint m5 = new MyPoint(90, 70);
        MyPoint m6 = new MyPoint(51, 22);
        MyPoint m7 = new MyPoint(95, 95);

        List<MyPoint> l = new ArrayList<MyPoint>();
        l.add(m1);
        l.add(m2);
        l.add(m3);
        l.add(m4);
        l.add(m5);
        l.add(m6);
        l.add(m7);
        System.out.println(MyPoint.getMinDistance(l));
    }
}


