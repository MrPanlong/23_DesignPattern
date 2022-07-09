package BuilderPattern.prototype.shape;

import java.io.Serializable;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:08
 */
public abstract class Shape implements Cloneable, Serializable {
   private String id;
   private String type;
   abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    protected Shape clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (Shape) clone;
    }
}
