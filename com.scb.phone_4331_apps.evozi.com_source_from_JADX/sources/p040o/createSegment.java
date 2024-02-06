package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createSegment */
public final class createSegment {
    @SerializedName("tileVersion")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof createSegment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((createSegment) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BondAccountSummaryRequest(tilesVersion=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public createSegment(String str) {
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
