import java.util.*;

/*
 * calculator the income tax:
 */

public class incom {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the amount: =");

            int income = sc.nextInt();
            int tax;

            if (income < 500000) {
                tax = 0;

            } else if (income >= 500000 && income < 1000000) {
                tax = (int) (income * 0.2);
            }

            else {
                tax = (int) (income * 0.3);
            }

            System.out.println(" Your Income Tax =" + tax);
        }

    }

}