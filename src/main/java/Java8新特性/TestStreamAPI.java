package Java8新特性;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by zhangzewen on 2020/3/11
 */
public class TestStreamAPI {

    //1、求平方
    @Test
    public void test1(){
        Integer[] nums = new Integer[]{1,2,3,4,5};
        Arrays.stream(nums)
                .map(x->x*x)
                .forEach(System.out::println);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 111.11, Employee.Status.BUSY),
            new Employee("李四", 35, 222.22, Employee.Status.FREE),
            new Employee("王五", 36, 333.33, Employee.Status.VOCATION),
            new Employee("赵六", 45, 444.44, Employee.Status.BUSY),
            new Employee("田七", 66, 555.55, Employee.Status.BUSY),
            new Employee("田七", 66, 555.55, Employee.Status.BUSY),
            new Employee("田七", 66, 555.55, Employee.Status.BUSY),
            new Employee("田七", 66, 555.55, Employee.Status.BUSY)
    );

    //2、计算数量
    @Test
    public void test2(){
        Optional<Integer> optional = employees.stream()
                .map(employee -> 1)
                .reduce(Integer::sum);
        System.out.println(optional.get());
    }



}
















