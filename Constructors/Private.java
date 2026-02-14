package Constructors;

public class Private {
    int a;
    double b;

    private Private(){
        a=10;
        b=14.333;
        System.out.println(a+" " +b);
    }
    public static void main(String[] args) {
        Private r = new Private();
    }
}
