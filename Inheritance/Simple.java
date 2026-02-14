package Inheritance;

//! private cannot be inherit
//! protected can be inherit 
class Student {
    int roolno;
    String name;
    void input(){
        System.out.println("Superclass message");
    }
}
public class Simple extends Student {
    void disp(){
        System.out.println("subclass message");
    }
    public static void main(String[] args) {
        Simple r = new Simple();
        r.disp();
        r.input();
    }
}
