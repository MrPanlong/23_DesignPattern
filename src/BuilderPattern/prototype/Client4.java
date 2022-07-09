package BuilderPattern.prototype;

import java.io.Serializable;
import java.util.Date;
/**
 *
 */
public class Client4 {
    public static void testNew(int size){
        long start = System.currentTimeMillis();
        for (int i = 0; i <size ; i++) {
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("消耗"+(end - start)+"ms");
    }
    public static void testClone(int size) throws CloneNotSupportedException{
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for (int i = 0; i <size ; i++) {
            Laptop temp = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("消耗"+(end - start)+"ms");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);

    }


}

class Laptop implements Cloneable{
    public Laptop(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();//直接调用object对象clone()方法
        return obj;
    }
}