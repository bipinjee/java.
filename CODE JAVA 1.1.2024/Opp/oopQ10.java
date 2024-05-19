package Opp;

// ye code me bhi problems hai 

// What would be the output of the following code?
class Test {
    static int a = 10;
    static int b;

    static void changeB() {
        b = a * 3;
    }

}

public class oopQ10 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a + Test.b);
    }

}
