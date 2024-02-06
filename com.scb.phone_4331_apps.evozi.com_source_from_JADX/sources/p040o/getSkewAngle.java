package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getSkewAngle */
public final class getSkewAngle {
    @SerializedName("storeUrl")
    public final List<String> IconCompatParcelizer;
    @SerializedName("enablingFlag")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productUrl")
    public final List<String> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSkewAngle)) {
            return false;
        }
        getSkewAngle getskewangle = (getSkewAngle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getskewangle.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getskewangle.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getskewangle.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.IconCompatParcelizer;
        int hashCode2 = list != null ? list.hashCode() : 0;
        List<String> list2 = this.read;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessInfoMarketURLEntity(enablingFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", storeUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productUrl=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
