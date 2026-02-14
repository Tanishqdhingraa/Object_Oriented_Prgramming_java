class Student {
    public static void main(String[] args) {
        Demo r = new Demo();
        r.display();
    }
}
class Demo {
    int a = 10;
    String b = "Tanishq dhingra";
    void display() {
        System.out.println(b+ " got "+a +" marks in exams");
    }
}
