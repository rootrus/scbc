package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.invalidateAllText */
public final class invalidateAllText {
    @SerializedName("productDetailList")
    public final List<CompoundTrimPathContent> IconCompatParcelizer;
    @SerializedName("detailImageURL")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("shortDesc")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("name")
    public final String read;
    @SerializedName("accountType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof invalidateAllText)) {
            return false;
        }
        invalidateAllText invalidatealltext = (invalidateAllText) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) invalidatealltext.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) invalidatealltext.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) invalidatealltext.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) invalidatealltext.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) invalidatealltext.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<CompoundTrimPathContent> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ETBProductDetailEntity(productName=");
        sb.append(this.read);
        sb.append(", accountType=");
        sb.append(this.write);
        sb.append(", shortDesc=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", detailImageURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productDetailList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
