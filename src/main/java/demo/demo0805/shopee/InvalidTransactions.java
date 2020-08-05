package demo.demo0805.shopee;


import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 23:41
 * @ Description：
 */
public class InvalidTransactions {

    public String[] invalidTransaction(String[] vTransaction) {
        Transaction[] trans = new Transaction[vTransaction.length];
        for (int i = 0; i < vTransaction.length; i++) {
            String tran = vTransaction[i];
            String[] strings = tran.split(",");
            trans[i] = new Transaction(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), strings[3]);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < trans.length; i++) {
            if (trans[i].money > 1000) {
                list.add(vTransaction[i]);
            } else {
                for (int j = 0; j < trans.length; j++) {
                    if (i != j && trans[i].name.equals(trans[j].name) && !trans[i].city.equals(trans[j].city)
                            && Math.abs(trans[i].time - trans[j].time) <= 60) {
                        list.add(vTransaction[i]);
                        break;
                    }
                }
            }
        }
        String[] results = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            results[i] = list.get(i);
        }
        return results;
    }

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

}

