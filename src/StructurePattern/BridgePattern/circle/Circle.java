package StructurePattern.BridgePattern.circle;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:02
 */
public class Circle extends Shape{
    private int x,y,radius;

    protected Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public Circle(int x,int y,int radius,DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
