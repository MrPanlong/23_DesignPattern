package BuilderPattern.Factory.factorymethod.car;

import BuilderPattern.Factory.simplefactory.car.Audi;
import BuilderPattern.Factory.simplefactory.car.Car;

public class AudiFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
