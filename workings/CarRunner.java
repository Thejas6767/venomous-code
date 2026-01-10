class CarRunner {
    public static void main(String[] args) {
        Engine engine = new Engine("V8 Petrol");
        Car car = new Car(engine);

        car.displayCar();
    }
}