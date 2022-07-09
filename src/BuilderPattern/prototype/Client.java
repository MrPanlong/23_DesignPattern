package BuilderPattern.prototype;

import java.util.Date;
/**
 * www.sxt.cn浅复制
 */
public class Client {
    public static void main(String[] args) {
        Date date = new Date(23456789L);
        Sheep s1 = new Sheep("多利",date);
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());
        date.setTime(87654321L);

        System.out.println("-----------------------");

        try {
            Sheep s2 = (Sheep)s1.clone();
            s2.setName("java");
            System.out.println(s2);
            System.out.println(s2.getName());
            System.out.println(s2.getBirthday());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
