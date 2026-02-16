package Equals;

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }
}

public class Eq {

    public static void main(String[] args) {

        // ===== Example 1: String =====
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println("String comparison:");
        System.out.println(a == b); // true (same reference from string pool)
        System.out.println(a == c); // false (different object)
        System.out.println(a.equals(c)); // true (same value)

        System.out.println("----------------------");

        // ===== Example 2: Custom Object =====
        Student s1 = new Student(101);
        Student s2 = new Student(101);

        System.out.println("Object comparison:");
        System.out.println(s1 == s2); // false (different memory location)
        System.out.println(s1.equals(s2)); // true (because we overrode equals)
    }
}
