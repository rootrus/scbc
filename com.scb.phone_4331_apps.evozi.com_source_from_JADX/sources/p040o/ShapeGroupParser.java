package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ShapeGroupParser */
public class ShapeGroupParser {
    @SerializedName("pnList")
    public List<ShapePathParser> IconCompatParcelizer;
    @SerializedName("commercialLoanList")
    public List<RectangleShapeParser> MediaBrowserCompat$ItemReceiver;
    @SerializedName("lgList")
    public List<ShapeTrimPathParser> write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShapeGroupParser shapeGroupParser = (ShapeGroupParser) obj;
        List<RectangleShapeParser> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null ? shapeGroupParser.MediaBrowserCompat$ItemReceiver != null : !list.equals(shapeGroupParser.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        List<ShapeTrimPathParser> list2 = this.write;
        if (list2 == null ? shapeGroupParser.write != null : !list2.equals(shapeGroupParser.write)) {
            return false;
        }
        List<ShapePathParser> list3 = this.IconCompatParcelizer;
        List<ShapePathParser> list4 = shapeGroupParser.IconCompatParcelizer;
        if (list3 != null) {
            return list3.equals(list4);
        }
        if (list4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<RectangleShapeParser> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<ShapeTrimPathParser> list2 = this.write;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<ShapePathParser> list3 = this.IconCompatParcelizer;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
