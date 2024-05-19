public class fun_binomial {
    public static int bincoeff(int n, int r) {
        int fact_n = (n);
        int fact_r = (r);
        int fact_nmr = (n - r);
        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static void main(String[] args) {
        System.out.println(bincoeff(5, 2));
    }
}
