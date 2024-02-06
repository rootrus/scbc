package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.LinkedHashTreeMap;

/* renamed from: o.removeInternal */
public final class removeInternal {
    @SerializedName("remark")
    public final LinkedHashTreeMap.KeySet.C35691 MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("submitDateTime")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeInternal)) {
            return false;
        }
        removeInternal removeinternal = (removeInternal) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removeinternal.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) removeinternal.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        LinkedHashTreeMap.KeySet.C35691 r2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (r2 != null) {
            i = r2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdpConfirmationEntity(submitDateTime=");
        sb.append(this.read);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
