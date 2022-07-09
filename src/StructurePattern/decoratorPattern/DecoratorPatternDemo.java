package StructurePattern.decoratorPattern;

/**
 * @ author PanLong
 * @ since  2021-07-04 17:54
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
