class Student {
    int id;
    String name;

    // A class is a blueprint that defines properties and behavior of objects.
    // An object is a real-world instance of a class created using 'new'.

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // object creation
        s1.id = 1;
        s1.name = "Tanishq";
        s1.display();
    }
}
