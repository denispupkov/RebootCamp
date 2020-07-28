package day1;

public class Palindrome {

    public static void main(String[] args) {

        //String candidate = "racecar";
        //String candidate = "kayak";
        String candidate = "nolemonnomelon";
        //String candidate = "jhdsfbskjhfbskj";

        int count = candidate.length() / 2;
        boolean palindrome = false;

        for (int i = 0; i <count; i++) {
            if (candidate.charAt(i) == candidate.charAt(candidate.length() - i-1)) {
                palindrome=true;
            }
        else {
                palindrome=false;
         break;
            }

        }
        System.out.println(palindrome);


    }
}
