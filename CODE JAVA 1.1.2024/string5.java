
public class string5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } /// abcdefghijklmnopqrstuvwxyz
          // 0(26)
          // 0(26*n^2)
        System.out.println(sb.length());
    }
}
