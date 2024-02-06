package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.addKey */
public final class addKey {
    @SerializedName("urlEN")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("functionId")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tiles")
    public final List<jsonObjectToPoint> read;
    @SerializedName("urlTH")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addKey)) {
            return false;
        }
        addKey addkey = (addKey) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) addkey.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) addkey.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) addkey.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) addkey.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<jsonObjectToPoint> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlTileEntity(tiles=");
        sb.append(this.read);
        sb.append(", urlEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", urlTH=");
        sb.append(this.write);
        sb.append(", functionId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
