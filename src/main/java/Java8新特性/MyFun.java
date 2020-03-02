package Java8新特性;

/**
 * Created by zhangzewen on 2020/3/2
 */
@FunctionalInterface
public interface MyFun<T> {

    T getValue(T t);
}
