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


    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 111.11),
            new Employee("李四", 35, 222.22),
            new Employee("王五", 36, 333.33),
            new Employee("赵六", 45, 444.44),
            new Employee("田七", 66, 555.55)
    );

    @Test
    public void test3() {
        List<Employee> list = filterEmployees(employees);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    //需求：获取年龄大于35的员工信息
    public List<Employee> filterEmployees(List<Employee> emps) {
        List<Employee> filterEmps = new ArrayList<>();
        for (Employee emp : emps) {
            if (emp.getAge() > 35) {
                filterEmps.add(emp);
            }
        }
        return filterEmps;
    }

    //需求：获取工资大于400的员工信息
    public List<Employee> filterEmployees2(List<Employee> emps) {
        List<Employee> filterEmps = new ArrayList<>();
        for (Employee emp : emps) {
            if (emp.getSalary() > 400) {
                filterEmps.add(emp);
            }
        }
        return filterEmps;
    }

    //优化方式一：策略模式

    @Test
    public void test4() {
        List<Employee> list = filterEmployee(employees, new FilterEmployeeByAge());
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("-------------------------");
        List<Employee> list2 = filterEmployee(employees, new FilterEmployeeBySalary());
        for (Employee employee : list2) {
            System.out.println(employee);
        }
    }

    @Test
    public void test5() {
        List<Employee> list = filterEmployee(employees, new FilterEmployeeBySalary());
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> myPredicate) {
        List emps = new ArrayList();
        for (Employee employee : list) {
            if (myPredicate.test(employee)) {
                emps.add(employee);
            }
        }
        return emps;
    }

    // 优化方式二：匿名内部类
    @Test
    public void test6() {
        List<Employee> list = filterEmployee(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() < 400;
            }
        });
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }




}

