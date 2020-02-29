package Java8新特性;

import org.junit.Test;

import java.util.*;

/**
 * Created by zhangzewen on 2020/2/27
 */
public class TestLambda {

    //原来的匿名内部类
    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    //lambda 表达式
    @Test
    public void test2() {
//        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> com = Integer::compare;
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    //需求：获取年龄大于35的员工信息
    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 111.11),
            new Employee("李四", 35, 222.22),
            new Employee("王五", 36, 333.33),
            new Employee("赵六", 45, 444.44),
            new Employee("田七", 66, 555.55)
    );

    public List<Employee> filterEmployees(List<Employee> emps) {
        List<Employee> filterEmps = new ArrayList<>();
        for (Employee emp : emps) {
            if (emp.getAge() > 35) {
                filterEmps.add(emp);
            }
        }
        return filterEmps;
    }


    public static void main(String[] args) {
        Employee e = new Employee("张三", 18, 111.11);
        e.getName();
        Employee employee = new Employee();


    }


}

