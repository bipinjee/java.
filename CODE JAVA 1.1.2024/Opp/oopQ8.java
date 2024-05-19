package Opp;

public class oopQ8 {

    /*
     * What will be the output of this code?
     * a. Error
     * b. 0 2 --- ye sahi hai
     * c. 1 2
     * d. 2 2
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.print(Book.count + " ");
        Book b1 = new Book(150);/// is ka koi output nhi hai isliye
        Book b2 = new Book(250);
        System.out.println(Book.count); /// b is right answer hai
    }

}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}