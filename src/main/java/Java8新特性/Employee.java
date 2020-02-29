package Java8新特性;

import lombok.Data;

/**
 * Created by zhangzewen on 2020/2/28
 */
@Data
public class Employee {
    private String name;
    private Integer age;
    private double salary;

    public Employee(String name, Integer age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
