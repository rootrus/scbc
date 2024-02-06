package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.processPendingNotifications */
public final class processPendingNotifications {
    @SerializedName("requestUUID")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardNo")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof processPendingNotifications)) {
            return false;
        }
        processPendingNotifications processpendingnotifications = (processPendingNotifications) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) processpendingnotifications.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) processpendingnotifications.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardActivationVerificationRequest(cardNo=");
        sb.append(this.read);
        sb.append(", requestUUID=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public processPendingNotifications(String str, String str2) {
        onGetStartedClick.write((Object) str, "cardNo");
        onGetStartedClick.write((Object) str2, "requestUUID");
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
