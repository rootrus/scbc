package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.unsetValue */
public final class unsetValue {
    @SerializedName("productUrl")
    private final List<String> IconCompatParcelizer;
    @SerializedName("storeUrl")
    private final List<String> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unsetValue)) {
            return false;
        }
        unsetValue unsetvalue = (unsetValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) unsetvalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) unsetvalue.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<String> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<String> list2 = this.IconCompatParcelizer;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessInfoMarketPlaceUrls(storeUrl=");
        sb.append(this.write);
        sb.append(", productUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public unsetValue(List<String> list, List<String> list2) {
        this.write = list;
        this.IconCompatParcelizer = list2;
    }
}
