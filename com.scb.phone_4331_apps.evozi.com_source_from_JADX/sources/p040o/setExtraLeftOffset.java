package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setExtraLeftOffset */
public final class setExtraLeftOffset extends setCurrentItemInternal {
    @SerializedName("prepaidCardList")
    public final List<setDragDecelerationFrictionCoef> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setExtraLeftOffset) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((setExtraLeftOffset) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<setDragDecelerationFrictionCoef> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredPrepaidCardsListEntity(prepaidCardList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
