public class opps_2_methods_overloding {
    public static void main(String[] args) {
        // calculator calc = new calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float) 1.5, (float) 2.5));
        // System.out.println(calc.sum(1, 2, 3));

        // /// methods of overrding--
        Deer d = new Deer();
        d.eat();
    }
}

// // methods of overring--
class Animal {
    void eat() {
        System.out.println("eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

// class calculator {
// int sum(int a, int b) {
// return a + b;
// }

// float sum(float a, float b) {
// return a + b;
// }

// int sum(int a, int b, int c) {
// return a + b + c;
// }
// }