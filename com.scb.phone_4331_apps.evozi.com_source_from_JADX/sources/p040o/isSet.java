package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isSet */
public final class isSet {
    @SerializedName("isSuccess")
    public boolean MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof isSet) && this.MediaBrowserCompat$ItemReceiver == ((isSet) obj).MediaBrowserCompat$ItemReceiver;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payload(isSuccess=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
