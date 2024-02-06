package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzrn */
public final class zzrn {
    @SerializedName("defaultImageURL")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("enableFlag")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrn)) {
            return false;
        }
        zzrn zzrn = (zzrn) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzrn.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzrn.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardRegistered(enableFlag=");
        sb.append(this.write);
        sb.append(", defaultImageURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private zzrn(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public zzrn() {
        this("", "");
    }
}
