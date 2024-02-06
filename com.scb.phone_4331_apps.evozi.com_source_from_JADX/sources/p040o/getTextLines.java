package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getTextLines */
public final class getTextLines {
    @SerializedName("sourceOfFund")
    public final List<IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.getTextLines$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("description")
        public final String read;
        @SerializedName("code")
        public final String write;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getTextLines) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((getTextLines) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<IconCompatParcelizer> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceOfFundsEntity(sourceOfFunds=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
