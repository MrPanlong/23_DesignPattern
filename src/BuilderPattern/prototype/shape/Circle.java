package BuilderPattern.prototype.shape;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:18
 */
public class Circle extends Shape{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Circle() {
        type ="Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside circle::draw() method.");
    }
}
