package day1;

import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {

        String word = "denniss";
        String concat = "";


        for (int i = 0; i < word.length(); i++) {
            if (concat.contains(word.charAt(i)+"")) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                    //concat += word.charAt(i);
                }
            }
            concat+=word.charAt(i);
            System.out.println(word.charAt(i)+" :: "+count);

        }


    }
}

