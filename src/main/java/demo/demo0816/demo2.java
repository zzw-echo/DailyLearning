package demo.demo0816;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 作者 ： zhangzewen
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/16 15:32
 * 描述 ：
 */
public class demo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

//        String s = "aaa undo undo undo";

        if (s.length() == 0 || s == null || s == "") {
            System.out.println("");
        } else {

            String[] arr = s.split("\\s+");

            if (s.length() == 0 || s == null || s == "") {
                System.out.println("");
            } else {

                ArrayList<String> list = new ArrayList<>();

                String temp = "";

                ArrayList<String> tempList = new ArrayList<>();

                int countNum = 0;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals("undo")) {
                        if (list.size() > 0) {
                            temp = list.get(list.size() - 1);
                            tempList.add(temp);
                            countNum++;
                            list.remove(list.size() - 1);
                        }
                    } else if (arr[i].equals("redo")) {
                        if (countNum > 0) {
                            list.add(tempList.get(countNum - 1));
                            countNum--;
                        }
                    } else {
                        list.add(arr[i]);
                        tempList = new ArrayList<String>();
                        countNum = 0;
                    }
                }

                String result = "";

                if (list.size() == 0) {
                    System.out.println("");
                } else {
                    for (int i = 0; i < list.size() - 1; i++) {
                        result += list.get(i);
                        result += " ";
                    }
                    result += list.get(list.size() - 1);
                    System.out.println(result);
                }
            }
        }
    }
}
