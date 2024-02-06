package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
public final class toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver {
    @SerializedName("storeUrl")
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productUrl")
    public final List<String> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver = (toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<String> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketUrl(storeUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productUrl=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
