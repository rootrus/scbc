package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.orderedBy */
public final class orderedBy {
    @SerializedName("depositList")
    private final List<createEntrySet> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof orderedBy) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((orderedBy) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<createEntrySet> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittancePostAccountsRequest(depositList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public orderedBy(List<createEntrySet> list) {
        this.read = list;
    }
}
