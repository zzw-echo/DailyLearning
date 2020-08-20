package demo.bedoreH.demo0805;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 15:28
 * @ Description：
 */
public class Transaction {
    String name;
    Integer time;
    Integer money;
    String city;

    public Transaction(String name, Integer time, Integer money, String city) {
        this.name = name;
        this.time = time;
        this.money = money;
        this.city = city;
    }
}
