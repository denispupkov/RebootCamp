package day1;

public class Anagram {

    public static void main(String[] args) {

        String a = "listen";
        String b = "silent";

        a=a.toLowerCase().replace(" ","");
        b=b.toLowerCase().replace(" ","");

        if (a.length()!=b.length()) {
            System.out.println("Not anagram");
            System.exit(0);
        }



        for (int i = 0; i <a.length() ; i++) {
            b=b.replaceFirst(a.charAt(i)+"","");

        }

        if (b.isEmpty()) {
            System.out.println("This is anagram");
        }
    else {
            System.out.println("This is NOT anagram");
        }
    }
}
