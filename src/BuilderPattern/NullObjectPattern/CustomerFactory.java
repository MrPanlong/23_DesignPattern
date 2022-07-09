package BuilderPattern.NullObjectPattern;

import java.util.AbstractList;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:27
 */
public class CustomerFactory {
    public static final String[] names = {"Rob","Joe","Julie"};
    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
