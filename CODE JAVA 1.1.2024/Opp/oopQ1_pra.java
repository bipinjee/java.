package Opp;

// package Opp;

class Student {
    String name;
    int marks;

    /// ek constructor pass karane ke baad run hota hai jee
    Student(String name) {

    }
    /*
     * A). s->name = "aman"
     * B). Student.name = "aman"
     * C). s.name = "aman" /// right --
     */
}

public class oopQ1_pra {
    public static void main(String[] args) {
        Student s = new Student(null);
        s.name = "Bipin Kumar";
        System.out.println(s.name);
    }
}
