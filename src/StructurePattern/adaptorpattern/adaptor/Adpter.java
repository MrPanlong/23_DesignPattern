package StructurePattern.adaptorpattern.adaptor;

/**
 * 客户端
 */
public class Adpter extends Adpatee implements Target {

    @Override
    public void request() {
        //一些操作
        super.adapteeRequest();
        //一些操作
    }
}
