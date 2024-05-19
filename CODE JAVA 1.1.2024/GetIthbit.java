
// operetor get
public class GetIthbit {
    public static int getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // other---
    public static int setIthbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // other--
    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // other--
    public static int UpdateIthbit(int n, int i, int newbit) {
        n = clearIthbit(n, i);
        int bitMask = newbit << i;
        return n | bitMask;
    }

    // other---
    public static int clearIthbits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // other--
    public static int ClearBitsRange(int n, int i, int j) {
        int a = ((~0) << (j + i));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // other
    public static int counSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check our LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(getithbit(10, 2));

        // System.out.println(setIthbit(10, 2));

        // System.out.println(clearIthbit(10, 1));

        // System.out.println(UpdateIthbit(10, 2, 1));

        // System.out.println(clearIthbits(10, 2));

        // System.out.println(ClearBitsRange(10, 2, 4));

        System.out.println(counSetBits(16));

    }
}
