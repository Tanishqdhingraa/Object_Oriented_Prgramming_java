package Constructors;

 class LS {
    int a;
    String name;
    //! This constructor will always made if we make it or not  
    // LS(){
    //     a = 0;
    //     name = "null";
    // }
    void show(){
        System.out.println(name+" Got "+a+" Marks");
    }
}
public class Default{
    public static void main(String[] args) {
        LS a = new LS();
        a.show();
    }
}