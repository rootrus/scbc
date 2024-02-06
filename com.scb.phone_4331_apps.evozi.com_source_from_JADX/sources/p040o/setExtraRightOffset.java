package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setExtraRightOffset */
public final class setExtraRightOffset extends setCurrentItemInternal {
    @SerializedName("proxyList")
    public final List<setExtraTopOffset> write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setExtraRightOffset) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((setExtraRightOffset) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<setExtraTopOffset> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromptpayProfilesEntity(proxyList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
