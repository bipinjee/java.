package Opp;

public class oopQ6 {
    public static void main(String[] args) {
        // ye code run nhi hoga
        // Vehicle obj1 = new Car();
        // obj1.Print1(); /// ye error de rha hai

        // Vehicle obj2 = new Vehicle();
        // obj2.Print();

    }

}

class Vehicle {
    void Print() {
        System.out.println("Base Class (Vehicle)");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Drived class (Car)");
    }
}
