package Opp;

public class Oop2c {

    public static void main(String[] args) {
        Student s1 = new Student(null);
        s1.name = "Bipin kumar";// is tarah bhi kar skte hai
        System.out.println(s1.name);
        s1.rollno = 12345;/// is tarah bhi kar skte hai
        System.out.println(s1.rollno);
        s1.classroom = 123;// is tarah bhi kar skte hai
        System.out.println(s1.classroom);

    }
}

class Student {
    String name;
    int rollno;
    int classroom;

    // ye constructor ka rule hai
    Student(String name) {
        // System.out.println();

        // ya yese karskte hai ya --------
        // this.name = "Bipin kumar";
        // this.rollno = 12345;
        // this.classroom = 123;

    }

}