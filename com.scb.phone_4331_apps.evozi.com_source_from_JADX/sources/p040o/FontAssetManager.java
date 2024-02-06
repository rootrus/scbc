package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.FontAssetManager */
public final class FontAssetManager {
    @SerializedName("defaultOption")
    public final String IconCompatParcelizer;
    @SerializedName("repaymentStartDate")
    public final DocumentData MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("options")
    public final List<setVertex> MediaBrowserCompat$ItemReceiver;
    @SerializedName("code")
    public final String read;
    @SerializedName("description")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontAssetManager)) {
            return false;
        }
        FontAssetManager fontAssetManager = (FontAssetManager) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fontAssetManager.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fontAssetManager.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fontAssetManager.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fontAssetManager.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fontAssetManager.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<setVertex> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = list != null ? list.hashCode() : 0;
        DocumentData documentData = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (documentData != null) {
            i = documentData.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlInstallmentFrequencyEntity(code=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(", defaultOption=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", options=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentStartDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
