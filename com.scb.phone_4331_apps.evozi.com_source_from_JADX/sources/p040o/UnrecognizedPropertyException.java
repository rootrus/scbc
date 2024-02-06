package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.UnrecognizedPropertyException */
public final class UnrecognizedPropertyException extends setCurrentItemInternal {
    @SerializedName("clientList")
    public final List<IgnoredPropertyException> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UnrecognizedPropertyException) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((UnrecognizedPropertyException) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<IgnoredPropertyException> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredClientListEntity(clientList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
