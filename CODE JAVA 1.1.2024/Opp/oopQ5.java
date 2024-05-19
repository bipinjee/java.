package Opp;

public class oopQ5 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.Print(); /// functions overriding (Drived class (Car))

        Vehicle obj2 = new Vehicle();
        obj2.Print();

    }

}

class Vehicle {
    void Print() {
        System.out.println("Base Class (Vehicle)");
    }
}

class Car extends Vehicle {
    void Print() {
        System.out.println("Drived class (Car)");
    }
}
