package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.invalidateText */
public final class invalidateText {
    @SerializedName("staticTiles")
    public final List<jsonObjectToPoint> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof invalidateText) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((invalidateText) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<jsonObjectToPoint> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ETBNoActiveCASAEntity(staticTiles=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
