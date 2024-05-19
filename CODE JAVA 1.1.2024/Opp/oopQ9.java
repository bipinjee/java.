package Opp;

// Which line has error?---

public class oopQ9 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98); // Line 2
        System.out.println(Test.marks); // Line 3
    }
}

class Test {
    static int marks;

    @SuppressWarnings("static-access") // ye line se koi matabal nhi hai
    void set_marks(int marks) {
        this.marks = marks; // Line 1

    }
}