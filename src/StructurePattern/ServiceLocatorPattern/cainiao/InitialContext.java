package StructurePattern.ServiceLocatorPattern.cainiao;

/**
 * @ClassName: InitialContext
 * @Date: 2022/6/12 13:27
 * @Author: panLong
 * @Description: TODO
 */

public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("service1")){
            System.out.println("Looking up and creating a new service1 object");
            return new Service1();
        }else if(jndiName.equalsIgnoreCase("service2")){
            System.out.println("looking up and creating a new service2 object");
            return new Service2();
        }
        return null;
    }
}
