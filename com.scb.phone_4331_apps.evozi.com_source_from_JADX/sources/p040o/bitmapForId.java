package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.bitmapForId */
public final class bitmapForId {
    @SerializedName("maxAmount")
    public final int MediaBrowserCompat$ItemReceiver;
    @SerializedName("minAmount")
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bitmapForId)) {
            return false;
        }
        bitmapForId bitmapforid = (bitmapForId) obj;
        return this.write == bitmapforid.write && this.MediaBrowserCompat$ItemReceiver == bitmapforid.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        return (this.write * 31) + this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOperatingAccountDetailsEntity(minAmount=");
        sb.append(this.write);
        sb.append(", maxAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
