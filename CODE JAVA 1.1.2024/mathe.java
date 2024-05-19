import java.util.*;
/*
 * Make 1 calculater with program : 
 */

public class mathe {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number a:=");
            int a = sc.nextInt();

            System.out.print("Enter the number b :=");
            int b = sc.nextInt();

            System.out.print("Enter the opereter:=");
            char opreter = sc.next().charAt(0);

            System.out.print("printr the value:=");

            switch (opreter) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("Wrong opreter");
                    break;
            }
        }
    }

}
