package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setOnCameraMoveStartedListener */
public final class setOnCameraMoveStartedListener {
    @SerializedName("paymentInfo")
    public final List<setOnIndoorStateChangeListener> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setOnCameraMoveStartedListener) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((setOnCameraMoveStartedListener) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<setOnIndoorStateChangeListener> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionalMetaData(paymentInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setOnCameraMoveStartedListener(List<setOnIndoorStateChangeListener> list) {
        onGetStartedClick.write((Object) list, "paymentInfo");
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
