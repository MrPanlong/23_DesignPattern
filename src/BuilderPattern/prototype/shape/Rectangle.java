package BuilderPattern.prototype.shape;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:11
 */
public class Rectangle extends Shape{
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public Rectangle() {
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
