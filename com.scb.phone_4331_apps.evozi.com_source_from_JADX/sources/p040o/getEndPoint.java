package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getEndPoint */
public final class getEndPoint {
    @SerializedName("promoFlag")
    public final String IconCompatParcelizer;
    @SerializedName("description")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("options")
    public final List<getFillType> read;
    @SerializedName("promoCode")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEndPoint)) {
            return false;
        }
        getEndPoint getendpoint = (getEndPoint) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getendpoint.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getendpoint.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getendpoint.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getendpoint.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<getFillType> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlProductCatalogueEntity(promoCode=");
        sb.append(this.write);
        sb.append(", promoFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", options=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
