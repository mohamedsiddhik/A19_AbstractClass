

package abstraction;

import java.util.concurrent.Callable;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
    abstract void accelerate();
    abstract void brake();
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Start the car");
    }

    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerate the car");
    }

    @Override
    void brake() {
        System.out.println("Brake the car");
    }
}
class Bike extends Vehicle{

    @Override
    void start() {
        System.out.println("Start the bike");
    }

    @Override
    void stop() {
        System.out.println("Stop the bike");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerate the bike");
    }

    @Override
    void brake() {
        System.out.println("Brake the bike");
    }
}


public class Vehicles {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        bike.accelerate();
        bike.brake();
        Car car = new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
    }





    }
