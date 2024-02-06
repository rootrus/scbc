package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fromRawRes */
public final class fromRawRes {
    @SerializedName("scanInfo")
    public final DeepLink MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("billerInfo")
    public final DeepLink read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromRawRes)) {
            return false;
        }
        fromRawRes fromrawres = (fromRawRes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fromrawres.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromrawres.read);
    }

    public final int hashCode() {
        DeepLink deepLink = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = deepLink != null ? deepLink.hashCode() : 0;
        DeepLink deepLink2 = this.read;
        if (deepLink2 != null) {
            i = deepLink2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitScanEntity(scanInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", billerInfo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
