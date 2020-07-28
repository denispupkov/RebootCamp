package day2;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321));
    }

    public static boolean isPalindrome (long num) {
        long remain = num;
        long rev = 0;
        long digit=0;

        while (remain!=0) {
            digit = remain%10;
            rev = rev*10+digit;
            remain/=10;
        }
        return num==rev;
    }

}
