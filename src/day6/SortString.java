package day6;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortString {

    public static void main(String[] args) {
        String notSorted = "DC501GCCCA098911";
        System.out.println(toSortString(notSorted));
    }

    public static String toSortString(String str) {
        String sorted = "";
        String each = "";

        for (int i = 0; i < str.length(); i++) {
            each+=str.charAt(i);

            if (Character.isLetter(str.charAt(i))) {

                if (i==str.length()-1 || !Character.isLetter(str.charAt(i+1))) {
                    sorted+=sorSubstring(each);
                    each = "";
                }

            } else {

                if (i==str.length()-1 || !Character.isDigit(str.charAt(i+1))) {
                    sorted+=sorSubstring(each);
                    each = "";
                }
            }

        }

        return sorted;
    }
private static String sorSubstring (String str) {
        String [] arr = str.split("");
    Arrays.sort(arr);
    return Arrays.toString(arr).replace("[","").
            replace("]","").replace(", ","");
}

}







