package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.unscheduleDrawable */
public class unscheduleDrawable {
    @SerializedName("issuer")
    public List<useTextGlyphs> write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unscheduleDrawable)) {
            return false;
        }
        unscheduleDrawable unscheduledrawable = (unscheduleDrawable) obj;
        List<useTextGlyphs> list = this.write;
        if (list != null) {
            return list.equals(unscheduledrawable.write);
        }
        if (unscheduledrawable.write != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<useTextGlyphs> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
