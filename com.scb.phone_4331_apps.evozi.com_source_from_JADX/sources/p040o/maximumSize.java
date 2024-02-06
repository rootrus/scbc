package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.maximumSize */
public final class maximumSize {
    @SerializedName("action")
    private final Number MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sessionId")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maximumSize)) {
            return false;
        }
        maximumSize maximumsize = (maximumSize) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) maximumsize.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) maximumsize.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Number number = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (number != null) {
            i = number.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerConsentRequest(sessionId=");
        sb.append(this.read);
        sb.append(", action=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public maximumSize(String str, Number number) {
        onGetStartedClick.write((Object) number, "action");
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = number;
    }
}
