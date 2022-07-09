package BuilderPattern.BusinessDelegatePattern;

/**
 * @ author PanLong
 * @ since  2021-08-01 12:41
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equals("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
