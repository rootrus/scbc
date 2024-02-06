package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fetchFromCache */
public final class fetchFromCache {
    @SerializedName("mobileNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("deviceState")
    public final String read;
    @SerializedName("refId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fetchFromCache)) {
            return false;
        }
        fetchFromCache fetchfromcache = (fetchFromCache) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fetchfromcache.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fetchfromcache.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fetchfromcache.write);
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
        sb.append("JuristicStateResponseEntity(deviceState=");
        sb.append(this.read);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", refId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
