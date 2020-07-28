package day2;

public class ArmStrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrong(8208));

    }

    public static boolean isArmstrong(int num) {

        String number = String.valueOf(num);
        int power = number.length();
        int total =0;
        int digit =0;

        for (int i = 0; i < power; i++) {

            digit = Integer.parseInt(number.charAt(i)+"");
            total+=Math.pow(digit,power);
        }

            if (total==num) {
            return true;
        }

            return false;

        }




    }





