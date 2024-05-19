import java.util.*;

/*
 * All loop ka code hai:
 */
public class loop_code2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            /*
             * fourt code:
             */
            System.out.println("enter the n:");
            int n = sc.nextInt();
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("sum of n:" + sum);
        }

        /*
         * first code:
         */
        // int counter = 0;
        // while (counter < 10) {
        // System.out.println("mister bipin");
        // counter++;
        // }
        // System.out.println("print mister bipin 10x:");

        /*
         * second code:
         */
        // int counter = 1;
        // while (counter <= 10) {
        // System.out.println(counter);
        // counter++;
        // }

        /*
         * third cose:
         */
        // System.out.print("Enter the number:=");
        // int n = sc.nextInt();

        // int counter = 1;
        // while (counter <= n) {
        // // System.out.println(counter);
        // System.out.print(counter + " ");
        // counter++;
        // }

    }
}
