package Polymorphism;


//!Runtime Polymorphism 
//!Method Overriding 
class A{
    void show(){
        System.out.println("Class A ");
    }
}
class C extends A {
    @Override
    void show() {
        super.show();//?This will execute A also 
        System.out.println("Class B");
    }//!This will execute first because Override 
    
}
public class B {

    public static void main(String[] args) {
        C r = new C();
        r.show();
    }
}
