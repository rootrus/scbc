package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.C1251R;

/* renamed from: o.fromAssetSync */
public final class fromAssetSync {
    @SerializedName("pagination")
    public final C1251R.integer MediaBrowserCompat$ItemReceiver;
    @SerializedName("billers")
    public final List<fromJsonInputStream> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromAssetSync)) {
            return false;
        }
        fromAssetSync fromassetsync = (fromAssetSync) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromassetsync.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fromassetsync.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<fromJsonInputStream> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        C1251R.integer integer = this.MediaBrowserCompat$ItemReceiver;
        if (integer != null) {
            i = integer.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitBillerSearchListEntity(billers=");
        sb.append(this.read);
        sb.append(", billPaymentBillerPaginationEntity=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
