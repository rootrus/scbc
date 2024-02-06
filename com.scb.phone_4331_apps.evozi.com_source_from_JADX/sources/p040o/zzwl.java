package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzwl */
public final class zzwl {
    @SerializedName("urlTH")
    public String IconCompatParcelizer;
    @SerializedName("urlEN")
    public String read;

    public /* synthetic */ zzwl() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwl)) {
            return false;
        }
        zzwl zzwl = (zzwl) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzwl.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzwl.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppConfigUrl(urlEN=");
        sb.append(this.read);
        sb.append(", urlTH=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzwl(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }
}
