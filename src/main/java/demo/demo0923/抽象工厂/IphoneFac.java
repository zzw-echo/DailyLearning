package demo.demo0923.抽象工厂;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 22:20
 */
public class IphoneFac implements PhoneFactory{
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu1();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen1();
    }
}
