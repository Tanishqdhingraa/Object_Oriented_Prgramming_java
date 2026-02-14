package Blocks;


//! Static block >> Instance block >> Constructors  


public class Static {
    // ? This will excute only if object is made
    Static() {
        System.out.println("Constructor");
    }

    //? This will excute when main function made
    static {
        System.out.println("Static block");
    }

    //? This will excute only if object is made
    {
        System.out.println("Instance block");

    }
    
    public static void main(String[] args) {
        Static st = new Static();
    } 
}
