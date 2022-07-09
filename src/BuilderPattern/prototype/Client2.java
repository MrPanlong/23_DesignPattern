package BuilderPattern.prototype;

import java.util.Date;

public class Client2 {
    public static void main(String[] args) {
        Date date = new Date(23456789L);
        Sheep2 s1 = new Sheep2("多利",date);
        Sheep2 s2 = null;
        try {
            s2 = (Sheep2)s1.clone();//深复制
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());
        date.setTime(87654321L);

        System.out.println("-----------------------");

            s2.setName("java");
            System.out.println(s2);
            System.out.println(s2.getName());
            System.out.println(s2.getBirthday());


    }
}
