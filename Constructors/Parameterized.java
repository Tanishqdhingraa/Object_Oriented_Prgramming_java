package Constructors;

class A{
    int x , y;
    A(int a, int b){// Parameterized constructor 
        x = a; y = b;
    }
    A(int a , String b){
        System.out.println(a + " " + b);

    }
    void display(){
        System.out.println(x +" "+ y);
    }
}

public class Parameterized {
    public static void main(String[] args) {
        A r = new A(100,200);
        r.display();
        A ref = new A(0, "TANISHq");
    }
}
