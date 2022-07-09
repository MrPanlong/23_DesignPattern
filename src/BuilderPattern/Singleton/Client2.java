package BuilderPattern.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射和反序列化破解单例模式
 */

class Client2 {
    public static void main(String[] args) throws Exception {
        SingletonDemo06 s1 = SingletonDemo06.getInstance();
        SingletonDemo06 s2 = SingletonDemo06.getInstance();
        System.out.println("单例模式06："+(s1 == s2));
        //通过反射方式直接调用私有构造器
//        Class<SingletonDemo06> clazz = (Class<SingletonDemo06>)Class.forName("BuilderPattern.Singleton.SingletonDemo06");
//        Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor(null);
//        //跳过访问私有
//        c.setAccessible(true);
//
//        SingletonDemo06 s3 = c.newInstance();
//        SingletonDemo06 s4 = c.newInstance();
//        System.out.println("反射访问对象"+(s3 == s4));

        //通过反序列化方式构造多个对象
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/a.txt"));
//        oos.writeObject(s1);
//        oos.flush();
//        //反序列化
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/a.txt"));
//        SingletonDemo06 s5 = (SingletonDemo06)ois.readObject();
//
//
//        System.out.println("序列化："+(s5 == s1));
//        oos.close();
//        ois.close();



    }

}