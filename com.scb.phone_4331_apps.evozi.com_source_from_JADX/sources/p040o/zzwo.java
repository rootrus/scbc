package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzwo */
public final class zzwo {
    @SerializedName("PRIVACY_MANAGE_DEEPLINK")
    public String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzwo() {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zzwo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((zzwo) obj).MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("AppConfigPrivacyManage(privacyManageDeeplink=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzwo(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
