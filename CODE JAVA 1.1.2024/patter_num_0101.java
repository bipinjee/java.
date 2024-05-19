public class patter_num_0101 {
    public static void zero_one_tringle(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // int sum=i+j; //ye bhi de sakte hai tab ye line likh sakte hai
                // if(sum%2==0)

                if ((i + j) % 2 == 0) { // even
                    System.out.print("1");
                } else { // odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_tringle(5);
    }
}
