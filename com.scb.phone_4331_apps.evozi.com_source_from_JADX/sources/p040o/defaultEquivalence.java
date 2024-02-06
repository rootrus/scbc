package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.zzfe;

/* renamed from: o.defaultEquivalence */
public final class defaultEquivalence {
    @SerializedName("device")
    public final zzfe.zzd MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defaultEquivalence)) {
            return false;
        }
        defaultEquivalence defaultequivalence = (defaultEquivalence) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) defaultequivalence.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) defaultequivalence.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) defaultequivalence.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        zzfe.zzd zzd = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (zzd != null) {
            i = zzd.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlResubmissionRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productType=");
        sb.append(this.write);
        sb.append(", device=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public defaultEquivalence(String str, String str2, zzfe.zzd zzd) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzd;
    }
}
