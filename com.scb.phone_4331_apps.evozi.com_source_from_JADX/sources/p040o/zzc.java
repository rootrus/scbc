package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzc */
public final class zzc {
    @SerializedName("logo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("name")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzc = (zzc) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzc.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzc.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopUpHistoryBillerEntity(logo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
