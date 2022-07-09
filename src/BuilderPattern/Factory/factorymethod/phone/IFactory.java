package BuilderPattern.Factory.factorymethod.phone;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:58
 */
public class IFactory implements AbstractFactory{



    @Override
    public PC makePC() {
        return new MiPC();
    }
}
