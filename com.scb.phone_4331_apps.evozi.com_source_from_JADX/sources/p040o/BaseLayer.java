package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.ShapeTrimPath;

/* renamed from: o.BaseLayer */
public final class BaseLayer {
    @SerializedName("fundSummaryList")
    public final List<ShapeTrimPath.Type> read;
    @SerializedName("dividendList")
    public final List<ShapeTrimPath> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLayer)) {
            return false;
        }
        BaseLayer baseLayer = (BaseLayer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) baseLayer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) baseLayer.write);
    }

    public final int hashCode() {
        List<ShapeTrimPath.Type> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<ShapeTrimPath> list2 = this.write;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FundDetailsDataEntity(fundSummaryList=");
        sb.append(this.read);
        sb.append(", dividendList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
