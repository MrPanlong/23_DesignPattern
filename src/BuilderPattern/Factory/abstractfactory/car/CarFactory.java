package BuilderPattern.Factory.abstractfactory.car;

public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();

}
