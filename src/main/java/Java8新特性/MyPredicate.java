package Java8新特性;

/**
 * Created by zhangzewen on 2020/2/29
 */
@FunctionalInterface
public interface MyPredicate<T> {

    boolean test(T t);
}
