
public class strings3 {
    public static void main(String[] args) {
        String s1 = "Bipin";
        // String s2 = "Bipin";
        String s3 = new String("Bipin");

        // if (s1 == s2) {
        // System.out.println("Strins are equal");
        // } else {
        // System.out.println("string are not equal");
        // }
        // if (s1 == s3) {
        // System.out.println("strings are equal");
        // } else {
        // System.out.println("strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

    }
}
