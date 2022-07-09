package BuilderPattern.BusinessDelegatePattern;

/**
 * @ author PanLong
 * @ since  2021-08-01 12:44
 */
public class Client {
    BusinessDelegate businessDelegate;
    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate = businessDelegate;
    }
    public void doTask(){
        businessDelegate.doTask();
    }
}
