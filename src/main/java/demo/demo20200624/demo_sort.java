package demo20200624;

import java.util.Scanner;

public class demo_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //冒泡排序算法
        String[] numbers = new String[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextLine();
        }

        sc.close();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int x = i + 1; x < numbers.length; x++) {
                //拿到前一个String
                char[] charBefore = numbers[i].toCharArray();
                //拿到后一个String
                char[] charsAfter = numbers[x].toCharArray();
                //计算当前变换的String[x]的长度
                int length = numbers[x].length();
                //获取最短循环次数,以免下标越界
                int loopNumber = Math.min(charBefore.length, length);
                for (int j = 0; j < loopNumber; j++) {
                    //判断前一位的首字母是否小于后一位,例如:首字母a<首字母b则不用再比较
                    if ((int) charBefore[j] < (int) charsAfter[j]) {
                        break;
                    }
                    //判断前一位字母是否大于后一位字母,如果大于则替换位置
                    else if ((int) charBefore[j] > (int) charsAfter[j]) {
                        String temp = numbers[i];
                        numbers[i] = numbers[x];
                        numbers[x] = temp;
                        break;
                    }
                    //如果两个String的长度不同,最短内容的最短起始位到最短结束位 和 最长内容的最短起始位和最短结束位的这段字符串长度内容相等,
                    // 则长度最短的放在前面,例如String a = "asd";String b = "as"; 则 字符串b排在前面
                    else if (j == loopNumber - 1 && charBefore[loopNumber - 1] == charsAfter[loopNumber - 1]) {
                        if (charBefore.length > charsAfter.length) {
                            String temp = numbers[i];
                            numbers[i] = numbers[x];
                            numbers[x] = temp;
                        }
                    }
                }
            }
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}