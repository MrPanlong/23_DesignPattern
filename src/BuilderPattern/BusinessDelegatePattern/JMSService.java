package BuilderPattern.BusinessDelegatePattern;

/**
 * @ author PanLong
 * @ since  2021-08-01 12:40
 */
public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("processing task by invoking JMS Service");
    }
}
