package day2;

public class PrimeNumber {

    public static void main(String[] args) {

        printAllTo(100);

    }


    public static void printAllTo(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
return true;
    }

}


