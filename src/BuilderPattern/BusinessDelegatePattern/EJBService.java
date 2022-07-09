package BuilderPattern.BusinessDelegatePattern;

/**
 * @ author PanLong
 * @ since  2021-08-01 12:15
 */
public class EJBService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
