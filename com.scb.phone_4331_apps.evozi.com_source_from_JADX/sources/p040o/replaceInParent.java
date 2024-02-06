package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.replaceInParent */
public final class replaceInParent {
    @SerializedName("qrMaxLimitAmount")
    public final String IconCompatParcelizer;
    @SerializedName("qrMinLimitAmount")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("qrCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("merchantDailyLimitURL")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof replaceInParent)) {
            return false;
        }
        replaceInParent replaceinparent = (replaceInParent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) replaceinparent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) replaceinparent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) replaceinparent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) replaceinparent.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MwQrCodeInfoEntity(qrCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", qrMinLimitAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", qrMaxLimitAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", merchantDailyLimitURL=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
