package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.NullLayer */
public final class NullLayer {
    @SerializedName("code")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("description")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullLayer)) {
            return false;
        }
        NullLayer nullLayer = (NullLayer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) nullLayer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) nullLayer.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenderReviewEntity(code=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
