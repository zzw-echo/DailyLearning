package Java8新特性;

/**
 * Created by zhangzewen on 2020/3/12
 */
public interface MyFun1 {

    default String getName(){
        return "111222";
    }

    public static void show(){
        System.out.println("接口中的静态方法");
    }
}
