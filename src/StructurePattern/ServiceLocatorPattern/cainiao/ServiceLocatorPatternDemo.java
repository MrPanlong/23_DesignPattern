package StructurePattern.ServiceLocatorPattern.cainiao;

/**
 * @ClassName: ServiceLocatorPatternDemo
 * @Date: 2022/6/12 13:56
 * @Author: panLong
 * @Description: TODO
 */
/*
步骤1 和步骤2，主要表现接口之间的多态性，指定行为方式。

步骤3：也就是工厂模式的应用，通过类名来确定要实例化的对象。

步骤4：用的是下面的传输对象模式。对实体类集合进行操作，主要是在集合中 获取/添加 实体类对象。

步骤5定位器：使用步骤3来创建实例，使用步骤4来添加到集合，或者从集合中获取。（缓存中没有才会创建）

步骤6:  调用步骤5得到实体类，并执行实体类的方法
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
