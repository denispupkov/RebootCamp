package day1;

public class FinRa {

    public static void main(String[] args) {

        for (int i = 1; i <=30 ; i++) {

              if (i%3==0 && i%5==0) {
                  System.out.println("FINRA");
              continue;
              }
            if (i%3==0) {
                System.out.println("FIN");
                continue;
            }
            if (i%5==0) {
                System.out.println("RA");
            continue;
          }
            System.out.println(i);
            }




    }
}
