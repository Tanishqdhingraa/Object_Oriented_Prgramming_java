package Diamond_problem;

interface A {
    default void show() {
        System.out.println("A's show()");
    }
}

interface B {
    default void show() {
        System.out.println("B's show()");
    }
}

class C implements A, B {

    // Must override to resolve ambiguity
    public void show() {
        System.out.println("Resolved Diamond Problem");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
