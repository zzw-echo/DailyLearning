package demo.draft.demo0806.shopee;

import java.util.ArrayList;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 12:46
 * @ Description：
 */
public class InvalidTransactions {

    public String[] invalidTransaction(String[] vTransaction) {
        int len = vTransaction.length;

        Transaction[] trans = new Transaction[len];

        for (int i = 0; i < len; i++) {
            String tran = vTransaction[i];
            String[] strings = tran.split(",");
            trans[i] = new Transaction(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), strings[3]);
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (trans[i].money > 1000){
                list.add(vTransaction[i]);
            }else{
                for (int j = 0; j < len; j++) {
                    if (i != j && trans[i].name.equals(trans[j].name) && !trans[i].city.equals(trans[j].city)
                    && Math.abs(trans[i].time - trans[j].time) <= 60){
                        list.add(vTransaction[i]);
                        break;
                    }
                }
            }
        }

        String[] result = list.toArray(new String[list.size()]);
        return result;
    }


    private class Transaction {
        String name;
        Integer time;
        Integer money;
        String city;

        public Transaction() {
        }

        public Transaction(String name, Integer time, Integer money, String city) {
            this.name = name;
            this.time = time;
            this.money = money;
            this.city = city;
        }
    }

}
