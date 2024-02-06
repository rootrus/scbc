package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardToArray */
public final class standardToArray {
    @SerializedName("tileId")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("deviceId")
    private final String read;
    @SerializedName("tilesVersion")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardToArray)) {
            return false;
        }
        standardToArray standardtoarray = (standardToArray) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardtoarray.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardtoarray.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardtoarray.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FindByTileIdRequest(deviceId=");
        sb.append(this.read);
        sb.append(", tileId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tilesVersion=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public standardToArray(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "deviceId");
        onGetStartedClick.write((Object) str2, "tileId");
        onGetStartedClick.write((Object) str3, "tilesVersion");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
    }
}
