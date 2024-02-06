package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.pathSegmentsToString */
public final class pathSegmentsToString {
    @SerializedName("bondCalculationDisclaimer")
    public final String IconCompatParcelizer;
    @SerializedName("bondAccountList")
    public final List<delimiterOffset> MediaBrowserCompat$ItemReceiver;
    @SerializedName("bondAccountDisclaimer")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pathSegmentsToString)) {
            return false;
        }
        pathSegmentsToString pathsegmentstostring = (pathSegmentsToString) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) pathsegmentstostring.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) pathsegmentstostring.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) pathsegmentstostring.write);
    }

    public final int hashCode() {
        List<delimiterOffset> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BondAccountSummaryEntity(bondAccountList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", bondCalculationDisclaimer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bondAccountDisclaimer=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
