package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getInnerRadius */
public final class getInnerRadius {
    @SerializedName("securities")
    public final fetch IconCompatParcelizer;
    @SerializedName("adsList")
    public final List<getLayers> MediaBrowserCompat$ItemReceiver;
    @SerializedName("mutualfunds")
    public final forFile write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInnerRadius)) {
            return false;
        }
        getInnerRadius getinnerradius = (getInnerRadius) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getinnerradius.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getinnerradius.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getinnerradius.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        fetch fetch = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = fetch != null ? fetch.hashCode() : 0;
        forFile forfile = this.write;
        int hashCode2 = forfile != null ? forfile.hashCode() : 0;
        List<getLayers> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentSummaryEntity(securities=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mutualfunds=");
        sb.append(this.write);
        sb.append(", adsList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
