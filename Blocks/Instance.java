package Blocks;

public class Instance {

    //! Instance block >> Constructor >> Methods  
    Instance(){
        System.out.println("Constructor ");

    }
    {
        System.out.println("Instance block");
    }
    void show(){
        System.out.println("Method block");

    }
    public static void main(String[] args) {
        Instance r = new Instance();
        r.show();
    }
}
