package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ForwardingMap */
public final class ForwardingMap {
    @SerializedName("tokenId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ForwardingMap) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((ForwardingMap) obj).MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("MailingAddressConfirmationRequest(tokenId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ForwardingMap(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
