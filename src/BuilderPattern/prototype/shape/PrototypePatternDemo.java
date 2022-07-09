package BuilderPattern.prototype.shape;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:30
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape:"+clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape:"+clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape:"+clonedShape3.getType());

    }
}
