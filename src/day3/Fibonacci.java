package day3;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci(8);


    }

    public static void Fibonacci (int num) {
        int a =0;
        int b =1;

        System.out.print(a + " " + b);

        for (int i = 2; i < num; i++) {

            int next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);

        }

    }

}
