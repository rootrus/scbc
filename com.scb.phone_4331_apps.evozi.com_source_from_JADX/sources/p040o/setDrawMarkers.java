package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setDrawMarkers */
public final class setDrawMarkers extends setCurrentItemInternal {
    @SerializedName("smeLoanList")
    public final List<setDescription> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setDrawMarkers) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((setDrawMarkers) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<setDescription> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredSmeLoanListEntity(smeLoanList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
