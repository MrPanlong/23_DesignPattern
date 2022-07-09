package StructurePattern.adaptorpattern.adaptor;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConCreateTarget();
        target.request();

        Adpter adpter = new Adpter();
        adpter.request();
    }
}
