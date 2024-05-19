public class pattern_floyd_triangle4 {

    public static void floyds_tringle(int n) {

        // outer loop
        int counter = 1;
        for (int i = 1; i <= n; i++) {

            // inner loop -> how many times will counter be print
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyds_tringle(5);

    }
}
