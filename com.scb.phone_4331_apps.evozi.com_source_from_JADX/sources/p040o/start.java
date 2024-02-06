package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.start */
public class start {
    @SerializedName("maxIssuer")
    public int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("issuer")
    public List<useTextGlyphs> write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof start)) {
            return false;
        }
        start start = (start) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != start.MediaBrowserCompat$CustomActionResultReceiver) {
            return false;
        }
        List<useTextGlyphs> list = this.write;
        if (list != null) {
            return list.equals(start.write);
        }
        if (start.write != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<useTextGlyphs> list = this.write;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }
}
