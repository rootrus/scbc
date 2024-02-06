package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.readMapMaker */
public final class readMapMaker {
    @SerializedName("deviceIds")
    private final List<String> read;
    @SerializedName("tilesVersion")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readMapMaker)) {
            return false;
        }
        readMapMaker readmapmaker = (readMapMaker) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) readmapmaker.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) readmapmaker.write);
    }

    public final int hashCode() {
        List<String> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.write;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceRequest(deviceIds=");
        sb.append(this.read);
        sb.append(", tilesVersion=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public readMapMaker(List<String> list, String str) {
        onGetStartedClick.write((Object) list, "deviceIds");
        this.read = list;
        this.write = str;
    }
}
