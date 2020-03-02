package Java8新特性;

import org.junit.Test;

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

        System.out.println("---------------------");

        Runnable runnable1 = () -> System.out.println("hello Lambda! 1  ");
    }

}
