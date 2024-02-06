package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.copyOf */
public final class copyOf {
    @SerializedName("tilesVersion")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("prepaidCardList")
    public final List<ImmutableBiMap> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyOf)) {
            return false;
        }
        copyOf copyof = (copyOf) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) copyof.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) copyof.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<ImmutableBiMap> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCardSummaryRequest(prepaidCardList=");
        sb.append(this.read);
        sb.append(", tilesVersion=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public copyOf(List<ImmutableBiMap> list, String str) {
        onGetStartedClick.write((Object) list, "prepaidCardList");
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
