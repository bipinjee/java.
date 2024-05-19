public class oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.Color);
        // // dusra tarah se
        // p1.Color = "yellow";
        // System.out.println(p1.Color);

        // p1.setTip(5);
        // System.out.println(p1.tip);

        // constructors----
        Student s1 = new Student("bipin");
        System.out.println(s1.name);

        // Student s1 = new Student(null);
    }
}

// class Pen {
// String Color;
// int tip;

// void setColor(String newColor) {
// Color = newColor;
// }

// void setTip(int newTip) {
// tip = newTip;
// }
// }

// constructors 2 for Students
class Student {
    String name;
    int roll;

    Student(String name) {
        // this.name = name;
        System.out.println("seconds rules constructros");
    }

}
