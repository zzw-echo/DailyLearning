package Java8新特性;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * Created by zhangzewen on 2020/3/4
 * <p>
 * 方法引用：若Lambda 体中的方法，有方法已经实现了，我们可以使用“方法引用”
 * （可以理解为，方法引用是Lambda 表达式的另外一种表现形式）
 * <p>
 * 有3种语法格式：
 *
 * 对象::实例方法名
 *   类::静态方法名
 *   类::实例方法名
 *
 *
 */
public class TestMethodRef {

    //对象::实例方法名
    @Test
    public void test1(){
        PrintStream ps1 = System.out;
        Consumer<String> con1 = s -> ps1.println(s);

        PrintStream ps2 = System.out;
        Consumer<String> con2 = ps2::println;

        Consumer<String> con3 = System.out::println;
        con3.accept("111aaa");
    }

    @Test
    public



}















