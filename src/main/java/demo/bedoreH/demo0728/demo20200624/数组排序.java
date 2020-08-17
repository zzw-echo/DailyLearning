package demo0728.demo20200624;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangzewen on 2020/6/24
 */
public class 数组排序 {
    public static void demo(String[] strs){
        List<String> list = Arrays.asList(strs);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        String[] strs = {"bb","aa","ab","asd","BB"
                ,"AA","sdfa","hrth","yuiy","brtb"};
        demo(strs);
    }
}
