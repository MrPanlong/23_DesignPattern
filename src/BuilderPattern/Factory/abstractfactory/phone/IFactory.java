package BuilderPattern.Factory.abstractfactory.phone;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:30
 */
public class IFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
