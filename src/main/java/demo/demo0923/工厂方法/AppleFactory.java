package demo.demo0923.工厂方法;

import demo.demo0923.other.Apple;
import demo.demo0923.other.Fruit;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 22:05
 */
public class AppleFactory implements FruitFactory{
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
