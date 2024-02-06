package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImageAssetManager */
public final class ImageAssetManager {
    @SerializedName("nameTH")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("nameEN")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("deeplink")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageAssetManager)) {
            return false;
        }
        ImageAssetManager imageAssetManager = (ImageAssetManager) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) imageAssetManager.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) imageAssetManager.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) imageAssetManager.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlNTBApplyLoanButtonEntity(nameEN=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", nameTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", deepLink=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
