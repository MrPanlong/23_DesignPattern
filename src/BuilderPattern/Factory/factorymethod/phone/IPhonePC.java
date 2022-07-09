package BuilderPattern.Factory.factorymethod.phone;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:58
 */
public class IPhonePC implements PC{
    public IPhonePC(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("IPhonePC hello world");
    }
}
