package StructurePattern.FacadePattern;

/**
 * @ author PanLong
 * @ since  2021-07-04 18:06
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
