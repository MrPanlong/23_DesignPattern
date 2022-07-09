package BuilderPattern.Factory.simplefactory.phone;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:30
 */
public class Demo {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone miPhone = phoneFactory.makePhone("MiPhone");
        Phone iPhone = phoneFactory.makePhone("IPhone");
    }
}
