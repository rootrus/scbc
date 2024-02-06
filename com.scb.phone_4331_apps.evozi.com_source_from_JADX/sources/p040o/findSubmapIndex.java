package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.findSubmapIndex */
public final class findSubmapIndex {
    @SerializedName("depositList")
    private final List<ImmutableSortedMap> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof findSubmapIndex) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((findSubmapIndex) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<ImmutableSortedMap> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittancePutAccountsRequest(depositList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public findSubmapIndex(List<ImmutableSortedMap> list) {
        this.IconCompatParcelizer = list;
    }
}
