package StructurePattern.decoratorPattern;

/**
 * @ author PanLong
 * @ since  2021-07-04 17:52
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }
    public void setRedBorder(Shape decoratedShape){
        System.out.println("Border color:Red");
    }
    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }
}
