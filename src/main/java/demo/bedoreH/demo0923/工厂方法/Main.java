package demo.bedoreH.demo0923.工厂方法;

import demo.bedoreH.demo0923.other.Apple;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 22:07
 */
public class Main {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Apple apple = (Apple) appleFactory.createFruit();

    }
}
