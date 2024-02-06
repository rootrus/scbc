package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Registry$MissingComponentException */
public final class Registry$MissingComponentException extends setCurrentItemInternal {
    @SerializedName("defaultImageURL")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("enableFlag")
    public String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Registry$MissingComponentException)) {
            return false;
        }
        Registry$MissingComponentException registry$MissingComponentException = (Registry$MissingComponentException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) registry$MissingComponentException.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) registry$MissingComponentException.MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("DebitCardRegisteredEntity(enableFlag=");
        sb.append(this.read);
        sb.append(", defaultImageURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
