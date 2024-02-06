package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.OnItemSelected;

/* renamed from: o.OnTouch */
public final class OnTouch {
    @SerializedName("agentList")
    public final List<OnItemSelected.Callback> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OnTouch) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((OnTouch) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<OnItemSelected.Callback> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetAgentsResponse(agentList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
