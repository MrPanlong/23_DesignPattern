package BuilderPattern.Factory.simplefactory.car;

public class Client02 {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");
        c1.run();
        c2.run();

        Car c3 = CarFactory02.createAudi();
        c3.run();
        Car c4 = CarFactory02.createByd();
        c4.run();
    }
}