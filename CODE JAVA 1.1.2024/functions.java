import java.util.Scanner;

public class functions {

    public static void printhelloworld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static /* void */ int calculatesum(int num1, int num2) { // parameters Or formal farameterss
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first number : ");
        // int a = sc.nextInt();
        // System.out.print("Enter the seconds Number : ");
        // int b = sc.nextInt();
        int sum = num1 + num2;
        // System.out.println("Two number sum is : " + sum);
        // agar viod ko lete hai to return likhna pre gaa nhi to nhi lena pare gaa
        return sum;
    }

    public static void main(String[] args) {
        // printhelloworld();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the seconds Number : ");
            int num2 = sc.nextInt();
            int sum = calculatesum(num1, num2); // Arguments OR actual parameters
            System.out.println("Two number sum is : " + sum);
        }
    }

}
