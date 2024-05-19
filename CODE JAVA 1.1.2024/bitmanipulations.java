public class bitmanipulations {

    // bit munupulation ka OR, AND, NOT OTHER opreter ka hai

    // public static void main(String[] args) {
    // // System.out.println(5 & 6);
    // // System.out.println(5 | 6);
    // // System.out.println(5 ^ 6);
    // // System.out.println(~5);
    // // System.out.println(5 << 2);
    // // System.out.println(6 >> 1);

    // /*
    // * yaha se dusra code start hai jo ki hai
    // * check oddoreven
    // */

    // }

    public static void oddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // Even
            System.out.println(" Even Number");
        } else {
            System.out.println(" Odd Numbers");
        }
    }

    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(11);
        oddorEven(14);
    }

}
