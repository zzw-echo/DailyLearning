package demo.bedoreH.demo0923.抽象工厂;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/23 22:19
 */
public interface PhoneFactory {
    Cpu getCpu();

    Screen getScreen();
}
