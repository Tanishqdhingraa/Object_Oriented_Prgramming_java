package Polymorphism;


//!Compile time Polymoriphism 
//!Overloading 

//! Same name of methods but different arguments 
public class A {
    
    void add(){
        int a = 10 , b = 20;
        int c = a +b;
        System.out.println(c);

    }
    void add(int x , int y ){
        int c = x +y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        A r = new A();
        r.add();
        r.add(12,432);
    }
}
