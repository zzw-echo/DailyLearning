package Java8新特性;

import org.junit.Test;

import java.util.Comparator;
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

}
