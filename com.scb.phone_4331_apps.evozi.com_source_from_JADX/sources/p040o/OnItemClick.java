package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnItemClick */
public final class OnItemClick {
    @SerializedName("PRIVACY_MANAGE_DEEPLINK")
    public final String IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OnItemClick) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((OnItemClick) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppConfigPrivacyManageEntity(privacyManageDeeplink=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
