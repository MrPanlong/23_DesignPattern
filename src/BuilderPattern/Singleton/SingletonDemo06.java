package BuilderPattern.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式
 */

public class SingletonDemo06 implements Serializable {
    //类初始化时，立即加载对象，无论你用不用
    //天然线程安全
    private static SingletonDemo06 instance;
    private SingletonDemo06(){
        if(instance!=null){
            throw new RuntimeException();
        }

    }
    //方法没有同步，
    public static synchronized SingletonDemo06 getInstance(){
        if(instance == null){
            instance = new SingletonDemo06();
        }
        return instance;
    }
    //反序列化，如果定义readresolve()方法则直接返回此方法指定的对象
    //而不需要单独再创建新对象
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }

}