package StructurePattern.ServiceLocatorPattern.cainiao;

/**
 * @ClassName: Service1
 * @Date: 2022/6/12 13:22
 * @Author: panLong
 * @Description: TODO
 */

public class Service2 implements Service{
    @Override
    public String getName() {
        return "service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing service2");
    }
}
