package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.addPoints */
public final class addPoints {
    @SerializedName("paymentInfo")
    public List<Utils> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof addPoints) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((addPoints) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<Utils> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionalMetaDataEntity(paymentInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
