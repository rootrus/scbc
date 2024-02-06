package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fetchBitmap */
public final class fetchBitmap {
    @SerializedName("refId")
    public final String MediaBrowserCompat$ItemReceiver;

    public fetchBitmap() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fetchBitmap) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((fetchBitmap) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeactivateEntity(refId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private fetchBitmap(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    private /* synthetic */ fetchBitmap(byte b) {
        this("");
    }
}
