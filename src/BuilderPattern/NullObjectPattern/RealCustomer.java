package BuilderPattern.NullObjectPattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:21
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name){
        this.name = name;
    }
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
