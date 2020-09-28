package demo.demo0923.工厂方法;

import demo.demo0923.other.Fruit;
import demo.demo0923.other.Pear;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 22:06
 */
public class PearFactory implements FruitFactory{
    @Override
    public Fruit createFruit() {
        return new Pear();
    }
}
