package StructurePattern.adaptorpattern.adaptor;

/**
 * @ author PanLong
 * @ since  2021-01-09 15:23
 */
public class ConCreateTarget implements Target{

    @Override
    public void request() {
        System.out.println("conCreateTarget 目标方法");
    }
}
