import java.util.*;
/*
 * check the student marks/satus exam :
 */

public class stu {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the student marks=");
            int marks = sc.nextInt();

            String status = ((marks >= 33) ? "pass" : "fail");
            System.out.println("Print the student status:=" + status);
        }
    }
}
