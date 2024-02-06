package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getPreviousEvictable */
public final class getPreviousEvictable {
    @SerializedName("documentType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productDetails")
    private final List<getHash> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPreviousEvictable)) {
            return false;
        }
        getPreviousEvictable getpreviousevictable = (getPreviousEvictable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getpreviousevictable.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getpreviousevictable.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getHash> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NcbMultiproductRequest(documentType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productDetails=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getPreviousEvictable(String str, List<getHash> list) {
        onGetStartedClick.write((Object) str, "documentType");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = list;
    }
}
