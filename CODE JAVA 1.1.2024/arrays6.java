
//pairs in an arrays with total pairs bhi hai 

public class arrays6 {
    public static void printpairs(int numbers[]) {
        int tp = 0; // total pairs ka ye line 1
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];// 2,4,6,8,10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++; // totap line pairs ka 2
            }
            System.out.println();
        }
        System.out.print("total pairs=" + tp); // ye bhi hai totap pairs ka 3 line
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printpairs(number);
    }

}
