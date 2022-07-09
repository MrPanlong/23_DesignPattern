package StructurePattern.decoratorPattern;

/**
 * @ author PanLong
 * @ since  2021-07-04 17:51
 */
public class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
