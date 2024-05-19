public class fun_che_primya_no {

    // // only for n>=2
    // public static boolean isprime(int n) {
    // // corner case
    // // 2
    // if (n == 1) {
    // return true;
    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isprime(7));

    }

}
