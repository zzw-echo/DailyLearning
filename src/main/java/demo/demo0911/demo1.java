package demo.demo0911;

import java.util.Arrays;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/11 23:37
 * <p>
 * 最长重复子串
 */
public class demo1 {

    //1、后缀数组法：将字符串的所有后缀字符串放在一个数组里，然后进行排序，遍历数组，寻找相邻两个字符串中的最长公共子串，即为最长重复子串。
    //相邻后缀字符串的最长前缀重复子串，即为最长重复字符串。因为，最长重复子串肯定在两个不同的后缀字符串里，且A、B前面一部分必然是相同的，并且经过排序两者必然是相邻的。
    public String longestDupSubstring(String s) {
        int len = s.length();
        String res = "";
        int maxLen = 0;
        if (len <= 1) return "";
        String[] strs = new String[len];    //存放s的后缀字符串
        for (int i = 0; i < len; i++) {
            strs[i] = s.substring(i, len);
        }
        Arrays.sort(strs);  //进行排序
        for (int i = 0; i < len - 1; i++) { //两个相邻字符串的最长公共前缀
            int tmp = commonStr(strs[i], strs[i + 1]);
            if (tmp > maxLen) {
                maxLen = tmp;
                res = strs[i].substring(0, maxLen);
            }
        }
        return res;
    }

    //两个后缀字符串的前缀最长公共子串
    private int commonStr(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0)
            return 0;
        int i = 0;
        while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i))
            i++;
        return i;
    }
}
