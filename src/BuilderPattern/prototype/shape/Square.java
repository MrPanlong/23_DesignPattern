package BuilderPattern.prototype.shape;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:16
 */
public class Square extends Shape{
    private String type;

    public Square() {
        type = "square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
