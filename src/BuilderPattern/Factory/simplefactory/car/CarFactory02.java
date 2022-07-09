package BuilderPattern.Factory.simplefactory.car;


public class CarFactory02 {
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createByd(){
        return new Byd();
    }

}