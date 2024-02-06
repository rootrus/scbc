package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.playAnimation */
public final class playAnimation {
    @SerializedName("adsList")
    private final List<pauseAnimation> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof playAnimation) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((playAnimation) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<pauseAnimation> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContextualAdsResponseEntity(adsList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
