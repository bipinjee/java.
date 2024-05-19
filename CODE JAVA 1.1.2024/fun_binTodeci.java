public class fun_binTodeci {
    public static void binTodecimal(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binTodecimal(101); // call by function
    }

}
