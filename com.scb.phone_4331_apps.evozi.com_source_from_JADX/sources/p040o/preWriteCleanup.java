package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.preWriteCleanup */
public final class preWriteCleanup {
    @SerializedName("tilesVersion")
    private final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof preWriteCleanup) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((preWriteCleanup) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ETBNoActiveCASARequest(tilesVersion=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public preWriteCleanup(String str) {
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.write = str;
    }
}
