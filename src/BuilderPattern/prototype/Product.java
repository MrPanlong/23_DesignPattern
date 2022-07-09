package BuilderPattern.prototype;

/**
 * @ author PanLong
 * @ since  2021-07-04 00:36
 */
public class Product implements Cloneable{
    private String part1;
    private String part2;
    private String part3;
    private String part4;


    public Product(String part1, String part2, String part3, String part4) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
    }
}
