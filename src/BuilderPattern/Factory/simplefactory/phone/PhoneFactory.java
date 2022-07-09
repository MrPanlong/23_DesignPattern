package BuilderPattern.Factory.simplefactory.phone;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:30
 */
public class PhoneFactory{
    public Phone makePhone(String phoneType){
        if(phoneType.equalsIgnoreCase("MiPhone")){
            return new MiPhone();
        }
        if(phoneType.equalsIgnoreCase("IPhone")){
            return new IPhone();
        }
        return null;
    }
}
