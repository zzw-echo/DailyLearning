package Java8新特性;

import org.junit.Test;

import java.util.Optional;

/**
 * Created by zhangzewen on 2020/3/12
 */
public class TestOptional {

    @Test
    public void test1(){
        Optional<Employee> op = Optional.of(new Employee());

        Employee employee = op.get();
        System.out.println(employee);

    }

    @Test
    public void test2(){
        Optional<Object> op = Optional.empty();
        System.out.println(op.get());
    }

    @Test
    public void test3(){
        Optional<Object> op = Optional.ofNullable(null);
        System.out.println(op.get());
    }

    @Test
    public void test4(){
        Optional<Object> op = Optional.ofNullable(null);
        if (op.isPresent()){
            op.get();
        }
    }
}
