
// Substrings
public class strings4 {
    public static String Substrings(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        // substring
        String str = "Helloworld";
        System.out.println(str.substring(0, 5));
        // System.out.println(Substrings(str, 0, 5));
    }
}
