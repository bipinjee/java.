import java.util.*;

/*
 * All qustion sloved in loop 
 */
public class loop_questions1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }

        // Q1. how many times 'Hello' is printed:
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i += 2;
        // }

        /*
         * Q2.write a program thet reads a set of integers,
         * and then prints the sum of the even and odd integers.
         */
        // int number;
        // int choice;
        // int evensum = 0;
        // int oddsum = 0;

        // do {
        // System.out.println(" choice the any two num:");
        // System.out.print(" Enter the number:");
        // number = sc.nextInt();
        // if (number % 2 == 0) {
        // evensum += number;
        // } else {
        // oddsum += number;
        // }
        // System.out.println("do you want to continue? press 1 for yes or 0 for no");
        // choice = sc.nextInt();
        // } while (choice == 1);
        // System.out.println("Sum of even number: " + evensum);
        // System.out.println("Sum of odd number:" + oddsum);

        /*
         * Q3.Write a program to find the factorial of any number enter by the user.
         */
        // int num; // to hold number
        // int fact = 1; // to hold factorial

        // System.out.print("Enter any positive integer:");
        // num = sc.nextInt();

        // for (int i = 1; i <= num; i++) {
        // fact *= i;
        // }
        // // factorial means ex-5=5*4*3*2*1=120:
        // System.out.println("factorial: " + fact);

        /*
         * Q4. Write a program to print the multiplication table of a number N, enterd
         * by
         * the user.
         */
        // System.out.print("Enter the number:");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(n + " *" + i + "=" + n * i);
        // }

        /*
         * Q5. What is wrong in the following programing?.
         */
        for (int i = 0; i <= 5; i++) {
            System.out.println("i=" + i);
            System.out.println("i after the loop=" + i);
        }
    }
}
