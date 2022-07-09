package BuilderPattern.Factory.factorymethod.phone;

/**
 * @ author PanLong
 * @ since  2021-01-06 19:58
 */
public class MiPC implements PC{
    public MiPC(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("MiPhone hello world");
    }
}
