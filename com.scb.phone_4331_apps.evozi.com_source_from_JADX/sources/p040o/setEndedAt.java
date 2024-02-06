package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setEndedAt */
public final class setEndedAt {
    @SerializedName("scope")
    public List<String> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("externalType")
    String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEndedAt)) {
            return false;
        }
        setEndedAt setendedat = (setEndedAt) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setendedat.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setendedat.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerWebViewGoogleLoginRequest(externalType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", scope=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
