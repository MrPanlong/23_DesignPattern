package BuilderPattern.Factory.simplefactory.car;

/**
 * 测试没有工厂模式
 */
public class Client01 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();

    }
}
