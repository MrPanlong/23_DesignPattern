package BuilderPattern.Factory.abstractfactory.phone;


import java.util.AbstractList;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:30
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory miFactory = new MiFactory();
        AbstractFactory iFactory = new IFactory();
        miFactory.makePhone();
        iFactory.makePhone();
    }
}
