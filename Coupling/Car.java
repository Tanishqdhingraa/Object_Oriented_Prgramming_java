package Coupling;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine(); // Direct dependency (Tight Coupling)

    void drive() {
        engine.start();
    }
}
