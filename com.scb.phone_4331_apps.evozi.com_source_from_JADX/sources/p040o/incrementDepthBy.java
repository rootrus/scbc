package p040o;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.incrementDepthBy */
public final class incrementDepthBy {
    @SerializedName("applicationUuid")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("email")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof incrementDepthBy)) {
            return false;
        }
        incrementDepthBy incrementdepthby = (incrementDepthBy) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) incrementdepthby.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) incrementdepthby.write);
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
        sb.append("HmlVerifyRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", email=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public incrementDepthBy(String str, String str2) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, Scopes.EMAIL);
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }
}
