package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getTextInternal */
public final class getTextInternal {
    @SerializedName("etbActiveCasa")
    public final boolean IconCompatParcelizer;
    @SerializedName("staticTiles")
    public final List<jsonObjectToPoint> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTextInternal)) {
            return false;
        }
        getTextInternal gettextinternal = (getTextInternal) obj;
        return this.IconCompatParcelizer == gettextinternal.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettextinternal.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        List<jsonObjectToPoint> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        return ((z ? 1 : 0) * true) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ETBCheckActiveCASAEntity(etbActiveCasa=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", staticTiles=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
