package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.isReversed */
public final class isReversed {
    @SerializedName("depositList")
    public final List<getColors> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("hasSCBAsMOA")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isReversed)) {
            return false;
        }
        isReversed isreversed = (isReversed) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isreversed.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isreversed.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getColors> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOperatingAccountEntity(hasSCBAsMOA=");
        sb.append(this.write);
        sb.append(", depositList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
