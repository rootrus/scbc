package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/* renamed from: o.applyJustification */
public class applyJustification {
    @SerializedName("occupations")
    public List<ShapeLayer> MediaBrowserCompat$CustomActionResultReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, ((applyJustification) obj).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver});
    }
}
