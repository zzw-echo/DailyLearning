package demo.bedoreH.demo0805;

/**
 * @ Author     ：zhangzewen
 * @ Date       ：Created in 2020/8/5 21:18
 * @ Description：
 */
public class Palindrome2 {

    public boolean isPalindrome(String s) {

        int n = s.length();
        int left = 0;
        int right = n - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
                left++;
                right--;
            }
        }
        return true;
    }


}
