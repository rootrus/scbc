package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setShowDividerHorizontal */
public final class setShowDividerHorizontal {
    @SerializedName("currency")
    public final String IconCompatParcelizer;
    @SerializedName("cashOffshore")
    public final List<setJustifyContent> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("liquidationValue")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("products")
    public final List<ItemListIntents> MediaBrowserCompat$MediaItem;
    @SerializedName("cashBalance")
    public final String read;
    @SerializedName("asOfDate")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setShowDividerHorizontal)) {
            return false;
        }
        setShowDividerHorizontal setshowdividerhorizontal = (setShowDividerHorizontal) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setshowdividerhorizontal.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setshowdividerhorizontal.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setshowdividerhorizontal.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setshowdividerhorizontal.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setshowdividerhorizontal.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setshowdividerhorizontal.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<setJustifyContent> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = list != null ? list.hashCode() : 0;
        List<ItemListIntents> list2 = this.MediaBrowserCompat$MediaItem;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesAccountDetailsEntity(asOfDate=");
        sb.append(this.write);
        sb.append(", liquidationValue=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cashBalance=");
        sb.append(this.read);
        sb.append(", currency=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cashOffshore=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", products=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }
}
