package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setImagesAssetsFolder */
public final class setImagesAssetsFolder {
    @SerializedName("accounts")
    public final List<isApplyingOpacityToLayersEnabled> IconCompatParcelizer;
    @SerializedName("repaymentDisclaimer")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("minPayAmount")
    public final String read;
    @SerializedName("minPayPercent")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setImagesAssetsFolder)) {
            return false;
        }
        setImagesAssetsFolder setimagesassetsfolder = (setImagesAssetsFolder) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setimagesassetsfolder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setimagesassetsfolder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setimagesassetsfolder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setimagesassetsfolder.read);
    }

    public final int hashCode() {
        List<isApplyingOpacityToLayersEnabled> list = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashOperativeAccountEntity(accounts=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", repaymentDisclaimer=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", minPayPercent=");
        sb.append(this.write);
        sb.append(", minPayAmount=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
