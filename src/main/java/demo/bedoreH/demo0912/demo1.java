package demo.bedoreH.demo0912;

import java.util.Scanner;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/12 20:10
 */
public class demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        PalindDeleteOne(s);
    }

    public static boolean palindrome(char[] chars, int start, int end) {
        while (start < end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void PalindDeleteOne(String s) {
        if (s == null || s.length() < 2) {
            System.out.println(s);
            return;
        }

        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        if (s.length() == 2) {
            if (chars[0] == chars[1]) {
                System.out.println(s);
            } else {
                System.out.println(chars[0]);
            }
        }

        int tmp = -2;
        while (start < end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else {
                if (palindrome(chars, start + 1, end)) {
                    tmp = start;
                    break;
                } else if (palindrome(chars, start, end - 1)) {
                    tmp = end;
                    break;
                } else {
                    tmp = -1;
                    break;
                }
            }
        }
        if (tmp == -2) {
            if (s.length()%2 == 1){
                tmp = s.length()/2+1;
                char[] result = new char[s.length() - 1];
                for (int i = 0; i < result.length; i++) {
                    if (i < tmp) {
                        result[i] = chars[i];
                    } else {
                        result[i] = chars[i + 1];
                    }
                }
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i]);
                }
            }else {

            System.out.println(s);}
        } else if (tmp == -1) {
            System.out.println("false");
        } else {
            char[] result = new char[s.length() - 1];
            for (int i = 0; i < result.length; i++) {
                if (i < tmp) {
                    result[i] = chars[i];
                } else {
                    result[i] = chars[i + 1];
                }
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);

            }
        }
    }
}
