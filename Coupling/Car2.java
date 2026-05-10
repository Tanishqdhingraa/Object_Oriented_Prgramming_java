package Coupling;

interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine started");
    }
}

class Car2 {
    Engine engine;

    Car2(Engine engine) { // Dependency Injection
        this.engine = engine;
    }

    void drive() {
        engine.start();
    }
}
