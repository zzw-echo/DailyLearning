package Java8新特性;

/**
 * Created by zhangzewen on 2020/2/29
 */
public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() > 35;
    }
}
