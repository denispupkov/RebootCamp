package day1;

public class CountJava {
    public static void main(String[] args) {

        String java = "jjjjjjvavavajavadadadadjajavapapapajavavavavajjjjjjjjajjjjjajajava";
        int count = 0;

        for (int i = 0; i < java.length()-3; i++) {
            if (java.substring(i,i+4).equalsIgnoreCase("java")) {
                count ++;
            }

        }
        System.out.println(count);

    }

}
