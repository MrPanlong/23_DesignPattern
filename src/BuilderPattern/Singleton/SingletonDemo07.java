package BuilderPattern.Singleton;
//保证一个类只有一个对象，并且提供一个访问该实例的访问点

/**
 * 优点：由于单例模式只生成一个实例，减少系统性能开销，
 * 当一个对象产生需要比较多的资源时，如读取配置，产生其他依赖对象时，则可以
 * 通过在应用启动时直接产生一个单例模式，然后永久驻留内存的方式解决
 */
//饿汉式：线程安全，调用效率高，
        //不能延时加载
public class SingletonDemo07 {
    private volatile static SingletonDemo07 uniqueSingleton;
    private SingletonDemo07(){}

}

