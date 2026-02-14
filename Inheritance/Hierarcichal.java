package Inheritance;

// Parent class
class Parent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

// First child class
class Child1 extends Parent {
    void showChild1() {
        System.out.println("I am Child1");
    }
}

// Second child class
public class Hierarcichal extends Parent {
    void showChild2() {
        System.out.println("I am Child2");
    }

    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.showParent();
        obj1.showChild1();

        Hierarcichal obj2 = new Hierarcichal();
        obj2.showParent();
        obj2.showChild2();
    }
}
