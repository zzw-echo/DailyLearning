package demo.bedoreH.demo0923.other;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 21:58
 */
public class FruitFac {

    public Fruit createFruit(String type) {
        if (type.equals("apple")) {
            return new Apple();
        } else if (type.equals("pear")) {
            return new Pear();
        }
        return null;
    }
}
