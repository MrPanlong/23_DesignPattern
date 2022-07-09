package BuilderPattern.Factory.factorymethod.car;

import BuilderPattern.Factory.simplefactory.car.Car;

public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        c1.run();

        Car c2 = new BydFactory().createCar();
        c2.run();

        Car c3 = new BenzFactory().createCar();
        c3.run();
    }
}
