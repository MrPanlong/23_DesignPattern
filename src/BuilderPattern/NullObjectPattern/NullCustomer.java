package BuilderPattern.NullObjectPattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:26
 */
public class NullCustomer extends AbstractCustomer{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
