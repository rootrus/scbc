package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getImageAsset */
public final class getImageAsset {
    @SerializedName("ncb")
    private final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getImageAsset) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((getImageAsset) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCreditPowerConsentEntity(ncb=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
