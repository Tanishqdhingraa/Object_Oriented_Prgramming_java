package Keywords;

class Subclass{
    int a=10;

}
public class Super extends Subclass{
    int a = 20;
    void show(){
        // This will prioritize super class variable 
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        Super b = new Super();
        b.show();
    }
}
