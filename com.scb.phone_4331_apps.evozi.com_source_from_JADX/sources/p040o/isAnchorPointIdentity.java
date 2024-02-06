package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.isAnchorPointIdentity */
public final class isAnchorPointIdentity {
    @SerializedName("bankingServiceTiles")
    public final List<isScaleIdentity> IconCompatParcelizer;

    public isAnchorPointIdentity() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof isAnchorPointIdentity) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((isAnchorPointIdentity) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<isScaleIdentity> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingServiceTilesResponseEntity(bankingServiceTiles=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private isAnchorPointIdentity(List<isScaleIdentity> list) {
        this.IconCompatParcelizer = null;
    }

    private /* synthetic */ isAnchorPointIdentity(byte b) {
        this((List<isScaleIdentity>) null);
    }
}
