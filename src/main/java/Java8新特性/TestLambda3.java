package Java8新特性;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by zhangzewen on 2020/3/3
 * <p>
 * Java8 内置的四大核心函数式接口
 * <p>
 * Consumer<T t>: 消费型接口
 * void accept(T t);
 * <p>
 * Supplier<T t>: 供给型接口
 * T get();
 * <p>
 * Function(T, R): 函数型接口
 * R apply(T t);
 * <p>
 * Predicate(T): 断言型接口
 * boolean test(T t);
 */
public class TestLambda3 {

    //Consumer 消费型接口
    @Test
    public void test1() {
        happy(10000.0, m -> System.out.println("每次消费" + m + "元.. "));
    }

    public void happy(Double money, Consumer<Double> con) {
        con.accept(money);
    }

    //Supplier<T> 供给型接口
    @Test
    public void test2() {
        List<Integer> numList = getNumList(10, () -> (int) (Math.random() * 100));
        for (Integer integer : numList) {
            System.out.println(integer);
        }
    }

    //需求： 产生指定个数的整数，并放入集合中
    public List<Integer> getNumList(Integer num, Supplier<Integer> sup) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }

    //Function<T, R> 函数型接口：

    //需求：用于处理字符串
    public String strHandler(String str, Function<String, String> fun) {
        return fun.apply(str);
    }

    @Test
    public void test3() {
        String newStr = strHandler("\t\t\t  去除  空格", s -> s.trim());
        System.out.println(newStr);

        String subStr = strHandler("这是截取前的原字符串", (str) -> str.substring(2, 5));
        System.out.println(subStr);
    }


    //Predicate<T> 断言型接口
    @Test
    public void test4(){
        List<String> list = Arrays.asList("Hello", "wfq", "echo","ok", "This is test ..");
        List<String> strList = filterStr(list, s -> s.length() > 3);
        for (String s : strList) {
            System.out.println(s);
        }
    }


    //需求：将满足条件的字符串，放入集合中
    public List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> strList = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)) {
                strList.add(str);
            }
        }
        return strList;
    }





}


























