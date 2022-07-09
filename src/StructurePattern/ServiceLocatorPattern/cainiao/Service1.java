package StructurePattern.ServiceLocatorPattern.cainiao;

/**
 * @ClassName: Service1
 * @Date: 2022/6/12 13:22
 * @Author: panLong
 * @Description: TODO
 */

public class Service1 implements Service{
    @Override
    public String getName() {
        return "service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing service1");
    }
}
