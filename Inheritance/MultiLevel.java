package Inheritance;

// Grandparent class
class Grandparent {
    void showGrandparent() {
        System.out.println("I am Grandparent");
    }
}

// Parent class inherits Grandparent
class Parent extends Grandparent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

// Child class inherits Parent
public class MultiLevel extends Parent {
    void showChild() {
        System.out.println("I am Child");
    }

    public static void main(String[] args) {
        MultiLevel obj = new MultiLevel();

        obj.showGrandparent(); // from Grandparent
        obj.showParent(); // from Parent
        obj.showChild(); // from Child
    }
}
