package Java8新特性;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhangzewen on 2020/2/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private Integer age;
    private double salary;

    public Employee(Integer age) {
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
    }
}
