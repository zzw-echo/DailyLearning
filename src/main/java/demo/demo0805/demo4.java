package demo.demo0805;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 15:27
 * @ Description：
 */
public class demo4 {

    /**
     * @param vTransaction string字符串一维数组
     * @return string字符串一维数组
     */
    public String[] invalidTransaction(String[] vTransaction) {
        // write code here
        Transaction[] trans = new Transaction[vTransaction.length];
        int index = 0;
        for (String tran : vTransaction) {
            String[] strings = tran.split(",");
            trans[index++] = new Transaction(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), strings[3]);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < trans.length; i++) {
            if (trans[i].money > 1000) {
                list.add(vTransaction[i]);
            } else {
                for (int j = 0; j < trans.length; j++) {
                    if (i != j && trans[j].name.equals(trans[i].name) && !trans[j].city.equals(trans[i].city) && Math.abs(trans[j].time - trans[i].time) <= 60) {
                        list.add(vTransaction[i]);
                        break;
                    }
                }
            }
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
