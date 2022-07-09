package StructurePattern.BridgePattern.circle;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:01
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle[dreen red],radius:"+radius+", x:"+x+", y:"+y);
    }
}
