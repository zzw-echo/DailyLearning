package Java8新特性;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * Created by zhangzewen on 2020/3/1
 *
 * 一、Lambda 表达式的基础语法：Java8 中引入了一个新的操作符"->" 该操作符称为箭头操作符或Lambda 操作符
 * Lambda表达式就是对接口的实现
 *
 * 左侧：Lambda表达式的参数列表
 * 右侧：Lambda表达式中需要执行的功能，即Lambda体
 *
 * 语法格式一：无参数，无返回值
 *      () -> System.out.println("hello Lambda! ")
 *
 * 语法格式二：有一个参数，并且无返回值
 *      (x) -> System.out.println("hello Lambda2!")
 *
 * 语法格式三：
 *
 */
public class TestLambda2 {

    @Test
    public void test1(){
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
    public void test2(){
        Consumer consumer = x -> System.out.println(x);
        consumer.accept("666");
    }

}
