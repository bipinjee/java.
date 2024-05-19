public class pattern_inver_half_pyramid2 {
    public static void pattern_inver_half_pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> space prints
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_inver_half_pyramid(4);
    }
}
