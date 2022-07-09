package BuilderPattern.Factory.abstractfactory.phone;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:30
 */
public class MiPhone implements Phone {
    public MiPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make xiaomi phone!");
    }
}
