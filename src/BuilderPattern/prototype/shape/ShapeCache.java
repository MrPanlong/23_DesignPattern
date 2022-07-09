package BuilderPattern.prototype.shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:20
 */
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId)  {
        Shape cacheShape = shapeMap.get(shapeId);
        return cacheShape.clone();
    }
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
