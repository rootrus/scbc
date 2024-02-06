package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.clearRenderTimes */
public final class clearRenderTimes {
    @SerializedName("text")
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public clearRenderTimes() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof clearRenderTimes) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((clearRenderTimes) obj).MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("Description(text=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private clearRenderTimes(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    private /* synthetic */ clearRenderTimes(byte b) {
        this((String) null);
    }
}
