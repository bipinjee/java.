import java.util.*;

/**
 * calculate the two number ;
 */
public class sim {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the two num = ");
            int a = sc.nextInt(); /* input first number(15) */
            int b = sc.nextInt(); /* input second number(25) */
            int sum = a + b; /* sum =(40) */
            // char input =scanner.next
            System.out.println(" Two num sum = " + sum); /* print a+b=40 */
        }

    }
}