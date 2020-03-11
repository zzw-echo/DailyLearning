package Java8新特性;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by zhangzewen on 2020/3/10
 * <p>
 * StreamAPI终止操作
 */
public class StreamAPI3 {

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

    /*
        查找与匹配
     */
    @Test
    public void test1() {
        boolean b = employees.stream().allMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b);

        boolean b1 = employees.stream().anyMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);

        boolean b2 = employees.stream()
                .noneMatch(employee -> employee.getStatus().equals(Employee.Status.FREE));
        System.out.println(b2);

        employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).findFirst();
        Optional<Employee> optional = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst();
        System.out.println(optional.get());

        Optional<Employee> optional1 = employees.stream()
                .filter(e -> e.getStatus().equals(Employee.Status.FREE)).findAny();
        System.out.println(optional1.get());

        Optional<Employee> optional2 = employees.parallelStream()
                .filter(e -> e.getStatus().equals(Employee.Status.FREE)).findAny();
        System.out.println(optional2.get());

    }

    @Test
    public void test2() {
        long count = employees.stream().count();
        System.out.println(count);

        Optional<Employee> optional = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(optional.get());

        Optional<Double> optional1 = employees.stream().map(Employee::getSalary)
                .min(Double::compareTo);
        System.out.println(optional1.get());

    }

    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(1, 2, 3);

        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        System.out.println("----------------");

        Optional<Double> op = employees.stream()
                .map(Employee::getSalary)
                .reduce(Double::sum);
        System.out.println(op.get());

    }
    /*
        收集
        collect
     */
    @Test
    public void test4(){
        List<String> list = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        System.out.println("---------------");

        Set<String> set = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("-----------------");
        HashSet<String> hashSet = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));

    }

    @Test
    public void test5(){
        //总数
        Long count = employees.stream()
                .collect(Collectors.counting());
        System.out.println(count);

        System.out.println("-------------------");

        //平均值
        Double avg = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);

        //总和
        DoubleSummaryStatistics summaryStatistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(summaryStatistics.getSum());

        Double sum = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));

        employees.stream().mapToDouble(Employee::getSalary).sum();

        System.out.println(sum);

        System.out.println("=================");

        Optional<Employee> optional = employees.stream()
                .collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
        System.out.println(optional.get());

        //最小值
        Optional<Double> optional1 = employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.minBy(Double::compareTo));

        System.out.println(optional1.get());

    }

    //分组
    @Test
    public void test6(){
        Map<Employee.Status, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus));

//        for (Map.Entry entry:map.entrySet()){
//            System.out.println(entry.getKey()+"=-="+entry.getValue());
//        }

        for (Map.Entry<Employee.Status, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"=-="+entry.getValue());
        }

    }


    //多级分组
    @Test
    public void test7(){
        Map<Employee.Status, Map<String, List<Employee>>> map = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getStatus, Collectors.groupingBy(
                                (e) -> {
                                    if (e.getAge() <= 35) {
                                        return "青年";
                                    } else if (e.getAge() <= 50) {
                                        return "中年";
                                    } else {
                                        return "老年";
                                    }
                                }
                        )));

        System.out.println(map);
    }

    //分区
    @Test
    public void test8(){
        Map<Boolean, List<Employee>> map = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 8000));

        System.out.println(map);
    }

    @Test
    public void test9(){
        DoubleSummaryStatistics dss = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        IntSummaryStatistics dss1 = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getAge));

        System.out.println(dss);
        System.out.println(dss1);
    }

    @Test
    public void test10(){
        String s = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining("，","---","==="));
        System.out.println(s);
    }





}






















