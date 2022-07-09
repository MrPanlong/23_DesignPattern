package StructurePattern.BridgePattern.circle;

/**
 * @ author PanLong
 * @ since  2021-07-04 13:01
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
