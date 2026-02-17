package Keywords;

class Subclass {

    void show() {
        System.out.println("Class superclass");
    }

}

public class Super2 extends Subclass {

    void show() {
        super.show();
        System.out.println("Class subclass");
    }

    public static void main(String[] args) {
        Super2 b = new Super2();
        b.show();
    }
}
