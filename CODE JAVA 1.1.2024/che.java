import java.util.*;

/*
 * Ternary Operator
 */
public class che {

    public static void main(String[] args) {

        // int number = 7;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number =");
            int number = sc.nextInt();

            String type = ((number % 2 == 0) ? "even" : "odd");

            System.out.println("Types of the value :" + type);
        }

    }

}
