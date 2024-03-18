interface Movable {
    void move();
}

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle implements Movable {
    @Override
    void start() {
        System.out.println("Car started.");
    }

    @Override
    public void move() {
        System.out.println("Car moving.");
    }
}

class Bike extends Vehicle implements Movable {
    @Override
    void start() {
        System.out.println("Bike started.");
    }

    @Override
    public void move() {
        System.out.println("Bike moving.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); 
        ((Movable) car).move(); 
        Vehicle bike = new Bike();
        bike.start(); 
        ((Movable) bike).move();
    }
}
