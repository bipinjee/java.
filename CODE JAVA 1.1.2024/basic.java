import java.util.*;

/*
 *      Find the Largest number :
 *       Two types 
 *         1. is input type and second 
 *          2.is user inpuit :
 */
public class basic {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of A =");
            int A = sc.nextInt();

            System.out.print("Enter the value of B =");
            int B = sc.nextInt();

            System.out.print("Enter the value of C =");
            int C = sc.nextInt();

            if ((A >= B) && (A >= C)) {
                System.out.println("Largest Num  is = A");
            }

            else if (B >= C) {
                System.out.println("Largest Num is = B");
            }

            else {
                System.out.println("Largest Num  is = C");
            }
        }

        // int A = 1, B = 3, C = 6;

    }
}
