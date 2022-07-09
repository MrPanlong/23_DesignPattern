package BuilderPattern.Factory.abstractfactory.car;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.start();
        e.run();

    }
}
