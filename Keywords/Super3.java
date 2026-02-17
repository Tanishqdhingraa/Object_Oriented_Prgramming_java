package Keywords;

class Subclass {

    Subclass(int a) {
        System.out.println("Class superclass  "+a);
    }

}

public class Super3 extends Subclass {
    
    Super3() {
        super(90);
        System.out.println("Class subclass");
    }

    public static void main(String[] args) {
        Super3 b = new Super3();
        
    }
}
//!Constructor 