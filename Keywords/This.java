package Keywords;

public class This {
    void show(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        This r = new This();
        System.out.println(r);
        r.show();
    }
}
