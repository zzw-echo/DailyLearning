package demo.demo1001;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/10/1 11:16
 */
public class demo1Main {

    public static void main(String[] args) {

        //static关键字可以用于变量、方法、代码块、内部类。表示这个特定的成员只属于某个类本身，而不是该类的某个对象。

        demo1 demoObj = new demo1();

        demo1.printHello();

        demoObj.printHello2();


    }

}
