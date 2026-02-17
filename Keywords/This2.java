package Keywords;

public class This2 {
    int a;
    This2(int a){
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        This2 r = new This2(100);
        r.show();
    }
}
