package StructurePattern.BridgePattern.circle;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:59
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle[color red],radius:"+radius+", x:"+x+", y:"+y);
    }
}
