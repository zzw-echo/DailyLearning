package Java8新特性;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhangzewen on 2020/3/9
 */
public class TestStreamAPI2 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 111.11),
            new Employee("李四", 35, 222.22),
            new Employee("王五", 36, 333.33),
            new Employee("赵六", 45, 444.44),
            new Employee("田七", 66, 555.55),
            new Employee("田七", 66, 555.55),
            new Employee("田七", 66, 555.55),
            new Employee("田七", 66, 555.55)
    );

    //中间操作
    /*
        筛选与切片
        filter
        limit
        skip(n)
        distinct
     */
    @Test
    public void test1() {
        //中间操作(延迟加载)
        Stream<Employee> stream = employees.stream().filter(e -> {
            System.out.println("this is middle operation of Stream API .. ");
            return e.getAge() > 35;
        });

        //终止操作
        stream.forEach(System.out::println);
    }

    @Test
    public void test2() {
        employees.stream().filter(e -> e.getSalary() > 300).limit(2).forEach(System.out::println);
    }

    @Test
    public void test3() {
        employees.stream().filter(e -> e.getSalary() > 300).skip(2).forEach(System.out::println);
    }

    @Test
    public void test4() {
        employees.stream().filter(e -> e.getSalary() > 300).distinct().forEach(System.out::println);
    }

    /*
        映射
        map
        flatMap
     */
    @Test
    public void test5(){
        List<String> list = Arrays.asList("aaA","bbb","ccc");

        list.stream().map(str->str.toUpperCase()).forEach(System.out::println);

        System.out.println("-----------");

        employees.stream().map(Employee::getName).forEach(System.out::println);

        System.out.println("---------------");

        Stream<Stream<Character>> streamStream = list.stream().map(TestStreamAPI2::filterCharacter);
        streamStream.forEach(sm -> {
            sm.forEach(System.out::println);
        });

        list.stream().flatMap(TestStreamAPI2::filterCharacter).forEach(System.out::println);

    }



    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    /*
        排序
        sorted() 自然排序
        sorted(Comparator com) 定制排序
     */
    @Test
    public void test6(){
        Stream<Employee> sorted = employees.stream().sorted((e1, e2) -> {
            if (e1.getAge().equals(e2.getAge())) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return -e1.getAge().compareTo(e2.getAge());
            }
        });

        sorted.forEach(System.out::println);
    }




}




























