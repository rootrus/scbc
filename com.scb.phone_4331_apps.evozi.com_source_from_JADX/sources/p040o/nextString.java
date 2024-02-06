package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.nextString */
public final class nextString {
    @SerializedName("goodToKnow")
    public final List<nextName> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof nextString) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((nextString) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<nextName> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressGoodToKnowResponseEntity(goodToKnow=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
