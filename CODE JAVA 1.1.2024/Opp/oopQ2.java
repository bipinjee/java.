package Opp;

/*
 *  a. name
    b. weight
    c. rollNumber
    d. schoolName
 */
class Person {
    String name;
    int weight;

    // ye access karta hai but
    // Person(String name) {

    // }
}

class Student extends Person {
    int rollNumber;
    String SchoolName;

    // ye access nhi karta hai
    // Student() {

    // }

}

/*
 * Which variable(s) can the class Person access in the following code?
 * name , weight
 * 
 * Which variable(s) can the class Student access in the following code?
 * hota to sabhi hota
 */
public class oopQ2 {
    public static void main(String[] args) {

        // ye kar rha hai but --
        Person p = new Person();
        p.name = "Bipin kumar";
        p.weight = 55;
        System.out.println(p.name);
        System.out.println(p.weight);

        // /// ye run nhi kar rha hai
        // Student s = new Student();
        // s.SchoolName = "GIET";
        // s.rollNumber = 12345;
        // System.out.println(s.SchoolName);
        // System.out.println(s.rollNumber);
    }
}
