package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.expiresAfterAccess */
public final class expiresAfterAccess {
    @SerializedName("id")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof expiresAfterAccess) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((expiresAfterAccess) obj).MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("ThirdPartySlipRequest(id=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
