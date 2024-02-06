package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setExtraOffsets */
public final class setExtraOffsets extends setCurrentItemInternal {
    @SerializedName("version")
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setExtraOffsets) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((setExtraOffsets) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromptPayTCEntity(promptpayTcLatestVersion=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
