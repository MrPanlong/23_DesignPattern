package StructurePattern.BridgePattern.circle;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:11
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
