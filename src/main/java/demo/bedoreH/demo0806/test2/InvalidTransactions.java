package demo.draft.demo0806.test2;

import java.util.ArrayList;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/6 14:45
 * @ Description：
 */
public class InvalidTransactions {


    public String[] invalidTransaction(String[] vTransaction) {

        int len = vTransaction.length;

        Transaction[] transactions = new Transaction[len];


        for (int i = 0; i < len; i++) {
            String[] strings = vTransaction[i].split(",");
            transactions[i] = new Transaction(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), strings[3]);
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (transactions[i].money > 1000) {
                list.add(vTransaction[i]);
            } else {
                for (int j = 0; j < len; j++) {
                    if (transactions[i].name.equals(transactions[j].name) && !transactions[i].city.equals(transactions[j].city)
                            && Math.abs(transactions[i].time - transactions[j].time) <= 60) {
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
