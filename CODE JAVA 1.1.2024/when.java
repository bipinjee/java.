
public class when {

    // if - else state ment--

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        System.out.print("Print the value:=");

        // int age = sc.nextInt();
        int age = 14;

        if (age >= 18) {
            System.out.println("Adult:Driver,Voter");

        }
        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Not Adult");
        }
    }
}
