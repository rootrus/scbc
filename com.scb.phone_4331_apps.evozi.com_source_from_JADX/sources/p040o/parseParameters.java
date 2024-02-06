package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.parseParameters */
public final class parseParameters {
    @SerializedName("paymentInfo")
    public final List<DeepLinkModule> IconCompatParcelizer;
    @SerializedName("extraData")
    public final DeepLinkEntry MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("merchantInfo")
    public final setMarker MediaBrowserCompat$ItemReceiver;
    @SerializedName("callbackUrl")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseParameters)) {
            return false;
        }
        parseParameters parseparameters = (parseParameters) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) parseparameters.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) parseparameters.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) parseparameters.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) parseparameters.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<DeepLinkModule> list = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        setMarker setmarker = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = setmarker != null ? setmarker.hashCode() : 0;
        DeepLinkEntry deepLinkEntry = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deepLinkEntry != null) {
            i = deepLinkEntry.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantMetaData(paymentInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", callbackUrl=");
        sb.append(this.write);
        sb.append(", merchantInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", extraData=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
