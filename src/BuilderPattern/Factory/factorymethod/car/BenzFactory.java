package BuilderPattern.Factory.factorymethod.car;

import BuilderPattern.Factory.simplefactory.car.Benz;
import BuilderPattern.Factory.simplefactory.car.Car;

public class BenzFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Benz();
    }
}
