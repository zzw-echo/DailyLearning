package Java8新特性;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangzewen on 2020/3/10
 * <p>
 * StreamAPI终止操作
 */
public class StreamAPI3 {
    /*
        查找与匹配
     */
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


}
