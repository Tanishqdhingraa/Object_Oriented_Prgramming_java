package Constructors;

class A {
    int a;
    String hero;
    A(){
        a = 10; 
        hero = "ram";
        System.out.println(a + hero);
    }
    A(A ref){
        a = ref.a;
        hero= ref.hero;
        System.out.println(a + hero);

    }
}



public class Copy {
    public static void main(String[] args) {
        // Copying constructor 
        A r = new A();
        A  r1 = new A(r);

    }
}
