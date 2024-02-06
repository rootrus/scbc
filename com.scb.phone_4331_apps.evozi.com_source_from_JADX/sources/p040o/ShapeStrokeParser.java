package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ShapeStrokeParser */
public class ShapeStrokeParser extends setCurrentItemInternal {
    @SerializedName("loanList")
    public ShapeGroupParser write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShapeGroupParser shapeGroupParser = this.write;
        ShapeGroupParser shapeGroupParser2 = ((ShapeStrokeParser) obj).write;
        if (shapeGroupParser != null) {
            return shapeGroupParser.equals(shapeGroupParser2);
        }
        if (shapeGroupParser2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        ShapeGroupParser shapeGroupParser = this.write;
        if (shapeGroupParser != null) {
            return shapeGroupParser.hashCode();
        }
        return 0;
    }
}
