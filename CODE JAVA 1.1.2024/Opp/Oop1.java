package Opp;

/// first videos 
/// first code for oop

public class Oop1 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // create a pen Object called p1
        p1.Setcolor("blue");
        // System.out.println(p1.color);

        // p1.settip(5);
        p1.tip = 5;
        // System.out.println(p1.tip);

        // p1.Setcolor("yellow");
        p1.color = "yellow";
        // System.out.println(p1.color);

        BankAccount MyAcc = new BankAccount();
        MyAcc.username = "Bipin Kumar";
        // MyAcc.password="bipin123"; /// not word this but
        // MyAcc.setPassword("bipin@123"); // run hoga but koi respons nhi dega kyo ki
        // private hai

    }

}

class BankAccount {
    public String username;

    // private String password;
    // public void setPassword(String psw) {
    // password = psw;
    // }

}

class Pen {
    String color;
    int tip;

    void Setcolor(String newColor) {
        color = newColor;
    }

    void settip(int newTip) {
        tip = newTip;
    }

}