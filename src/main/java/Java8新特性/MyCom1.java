package Java8新特性;

import java.util.Comparator;

/**
 * Created by zhangzewen on 2020/3/8
 */
public class MyCom1 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }
}
