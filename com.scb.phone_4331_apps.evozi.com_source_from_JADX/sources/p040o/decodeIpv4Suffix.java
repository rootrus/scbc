package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.decodeIpv4Suffix */
public final class decodeIpv4Suffix extends addPathSegment {
    @SerializedName("transactions")
    public final List<push> write;

    public decodeIpv4Suffix() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof decodeIpv4Suffix) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((decodeIpv4Suffix) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<push> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeejungPlanResponseEntity(transactions=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ decodeIpv4Suffix(byte b) {
        this((List<push>) null);
    }

    private decodeIpv4Suffix(List<push> list) {
        this.write = null;
    }
}
