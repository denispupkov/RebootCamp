package day6;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String example = "AAABBBCCCD";
        System.out.println(duplicateRemover(example));

    }

    public static String duplicateRemover (String str) {
        Set <String> stringWithDuplicates = new LinkedHashSet<>();

        for (int i = 0; i <str.length() ; i++) {
            stringWithDuplicates.add(str.charAt(i)+"");

        }
        str=stringWithDuplicates.toString();
        str=str.replace("[","").replace("]","").replace(", ","");


   return str;
}


}
