package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PINBlockException */
public final class PINBlockException {
    @SerializedName("code")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("header")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("description")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PINBlockException)) {
            return false;
        }
        PINBlockException pINBlockException = (PINBlockException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) pINBlockException.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) pINBlockException.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) pINBlockException.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountStatusEntity(code=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
