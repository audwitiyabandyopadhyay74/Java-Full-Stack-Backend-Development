abstract class Vehicle {
    abstract void start();
    
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started with key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}