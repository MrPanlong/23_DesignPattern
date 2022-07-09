package BuilderPattern.prototype;



import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Client3 {
    public static void main(String[] args) throws Exception {
        Date date = new Date(23456789L);
        Sheep s1 = new Sheep("多利",date);
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());
        date.setTime(87654321L);

        System.out.println("-----------------------");


        //Sheep s2 = (Sheep)s1.clone();
        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();//克隆好的对象
        date.setTime(12345654323456L);
        System.out.println(s1.getBirthday());
        s2.setName("python");
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());

    }

}