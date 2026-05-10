class Demo2{
    int a = 9;
    String b = "helllo";

    void Print(){
        System.out.println(a);
        System.out.println(b);
    }
}
class Demo{
    public static void main(String[] args) {
        Demo2 d = new Demo2();

        d.Print();
    }
}