import java.util.*;

/*
 * switch case statement :
 */

public class magic {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the butom: = ");
            int buttom = sc.nextInt();
            switch (buttom) {
                case 1:
                    System.out.println("Bipin");
                    break;
                case 2:
                    System.out.println("Satish");
                    break;
                case 3:
                    System.out.println("durgesh");
                    break;
                default:
                    System.out.println("fault buttom");
            }
        }
    }

}
