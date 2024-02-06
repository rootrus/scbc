package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.findByEntry */
public final class findByEntry {
    @SerializedName("avgRevenueList")
    public final List<skipToEndOfLine> IconCompatParcelizer;
    @SerializedName("category")
    public final List<skipQuotedValue> read;
    @SerializedName("shopTypeList")
    public final List<find> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findByEntry)) {
            return false;
        }
        findByEntry findbyentry = (findByEntry) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) findbyentry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) findbyentry.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) findbyentry.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<skipQuotedValue> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<find> list2 = this.write;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<skipToEndOfLine> list3 = this.IconCompatParcelizer;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShopInfoEntity(categories=");
        sb.append(this.read);
        sb.append(", shopTypeList=");
        sb.append(this.write);
        sb.append(", avgRevenueList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
