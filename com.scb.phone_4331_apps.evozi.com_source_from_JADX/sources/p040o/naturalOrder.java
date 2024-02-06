package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.naturalOrder */
public final class naturalOrder {
    @SerializedName("transactionToken")
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof naturalOrder) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((naturalOrder) obj).MediaBrowserCompat$ItemReceiver);
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
        sb.append("RemittanceConfirmRequest(transactionToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public naturalOrder(String str) {
        onGetStartedClick.write((Object) str, "transactionToken");
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
