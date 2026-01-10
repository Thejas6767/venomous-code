class Car {
    public String carEngine;
    public Engine engine;

    public Car(Engine engine) {
        this.carEngine = engine.engineType;
        this.engine = engine;
    }

    public void displayCar() {
        engine.engineDetails();
    }
}