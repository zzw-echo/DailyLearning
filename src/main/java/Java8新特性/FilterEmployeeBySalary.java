package Java8新特性;

/**
 * Created by zhangzewen on 2020/2/29
 */
public class FilterEmployeeBySalary implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() > 400;
    }
}
