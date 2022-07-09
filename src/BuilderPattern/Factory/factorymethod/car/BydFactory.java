package BuilderPattern.Factory.factorymethod.car;

import BuilderPattern.Factory.simplefactory.car.Byd;
import BuilderPattern.Factory.simplefactory.car.Car;

public class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}
