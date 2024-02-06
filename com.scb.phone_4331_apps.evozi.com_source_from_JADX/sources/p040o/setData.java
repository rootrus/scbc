package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setData */
public final class setData extends setCurrentItemInternal {
    @SerializedName("merchantWalletList")
    public final List<Chart> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setData) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((setData) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<Chart> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredMerchantListEntity(merchantWalletList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
