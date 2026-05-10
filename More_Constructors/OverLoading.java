package More_Constructors;


//! Default and private cannot be present in same class 
class A{
    int a; 
    String b;
    double c;

    A(int x){
        a=x;
        System.out.print("first Constructor-> ");
        System.out.println(a);
    }
    A(String y){
        b=y;
        System.out.print("Second Constructor-> ");

        System.out.println(b);

    }
    A(double z){
        c=z;
        System.out.print("Third Constructor-> ");

        System.out.println(c);

    }
}



public class OverLoading{
    public static void main(String[] args) {
        A r = new A(20);
        A r1 = new A("hero");
        A r2 = new A(10.00);

    }
}