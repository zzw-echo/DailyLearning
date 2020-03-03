package Java8新特性;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by zhangzewen on 2020/3/1
 * <p>
 * 一、Lambda 表达式的基础语法：Java8 中引入了一个新的操作符"->" 该操作符称为箭头操作符或Lambda 操作符
 * Lambda表达式就是对接口的实现
 * <p>
 * 左侧：Lambda表达式的参数列表
 * 右侧：Lambda表达式中需要执行的功能，即Lambda体
 * <p>
 * 语法格式一：无参数，无返回值
 * () -> System.out.println("hello Lambda! ")
 * <p>
 * 语法格式二：有一个参数，并且无返回值
 * (x) -> System.out.println("hello Lambda2!")
 * <p>
 * 语法格式三：有两个以上的参数，有返回值，Lambda 体中有多条语句
 * Comparator<Integer> com = (x, y) -> {
 * System.out.println("Compare Lambda! ");
 * return Integer.compare(x, y);
 * };
 * <p>
 * 语法格式四：若Lambda 体中只有一条语句，return 和 {} 都可以省略不写
 * Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
 * <p>
 * 语法格式五：类型推断，参数列表的数据类型可以省略，因为JVM编译器通过上下文推断
 * <p>
 * <p>
 * 二、Lambda 表达式需要函数式接口的支持
 * 接口中只有一个抽象方法
 * 可以用@FunctionalInterface 修饰，检查是否为函数式接口
 */
public class TestLambda2 {

    @Test
    public void test1() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello Lambda! ");
            }
        };

        runnable.run();
        System.out.println("---------------------");

        Runnable runnable1 = () -> System.out.println("hello Lambda! 1  ");
        runnable1.run();
    }

    @Test
    public void test2() {
        Consumer consumer = x -> System.out.println(x);
        consumer.accept("666");
    }

    @Test
    public void test3() {
        Comparator<Integer> com = (x, y) -> {
            System.out.println("Compare Lambda! ");
            return Integer.compare(x, y);
        };
    }

    @Test
    public void test4() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
//        Comparator<Integer> com = Comparator.comparingInt(x -> x);
    }


    //需求：对一个数进行运算
    @Test
    public void test5() {
        MyFun<Integer> myFun = (x) -> {
            int i = x + x;
            return i;
        };
        myFun.getValue(100);

        Integer op1 = operation(100, new MyFun<Integer>() {
            @Override
            public Integer getValue(Integer integer) {
                return integer * integer;
            }
        });

        Integer op2 = operation(100, x -> x * x);

    }

    public Integer operation(Integer num, MyFun<Integer> mf) {
        return mf.getValue(num);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 111.11),
            new Employee("李四", 35, 222.22),
            new Employee("王五", 36, 333.33),
            new Employee("赵六", 22, 444.44),
            new Employee("田七", 66, 555.55)
    );

    @Test
    public void test11() {
        Collections.sort(employees, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    //需求：字符串变大写
    @Test
    public void test12() {
        String s1 = strHandler("/t/t/t  去除  空格 ", str -> str.trim());
        System.out.println(s1);


        String s2 = strHandler("abcdef", str -> str.toUpperCase());
        System.out.println(s2);

        String s3 = strHandler("/t/t/t  去除  空格 ", str -> str.substring(2, 5));
        System.out.println(s3);
    }


    public String strHandler(String str, MyFun030301 mf) {
        return mf.getValue(str);
    }

}
