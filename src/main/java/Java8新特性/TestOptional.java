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
}
