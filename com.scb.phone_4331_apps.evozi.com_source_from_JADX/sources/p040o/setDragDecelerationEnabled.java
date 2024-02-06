package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setDragDecelerationEnabled */
public final class setDragDecelerationEnabled extends setCurrentItemInternal {
    @SerializedName("depositList")
    public final List<InvalidFormatException> write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setDragDecelerationEnabled) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((setDragDecelerationEnabled) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<InvalidFormatException> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredDepositListEntity(depositList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
