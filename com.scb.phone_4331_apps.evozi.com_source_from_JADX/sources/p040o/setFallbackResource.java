package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setFallbackResource */
public final class setFallbackResource extends setCurrentItemInternal {
    @SerializedName("displayName")
    final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("displayVisible")
    final Boolean read;
    @SerializedName("key")
    final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFallbackResource)) {
            return false;
        }
        setFallbackResource setfallbackresource = (setFallbackResource) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setfallbackresource.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setfallbackresource.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setfallbackresource.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Boolean bool = this.read;
        int hashCode2 = bool != null ? bool.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScopesEntity(key=");
        sb.append(this.write);
        sb.append(", displayVisible=");
        sb.append(this.read);
        sb.append(", displayName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
