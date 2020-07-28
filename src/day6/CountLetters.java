package day6;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public static void main(String[] args) {
        countLetters("apples are good for you");
    }

    public static void countLetters (String str) {
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char key = str.charAt(i);

            if (!map.containsKey(key)) {
                map.put(key,0);
            }
            map.put(key,map.get(key)+1);

        }
        System.out.println(map);
    }
}
