public class java7 {
    /**
     * @param args
     */
    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';
        // outer loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            // for (int star = 1; star <= line; star++) {
            // System.out.print("*");
            // }
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}
