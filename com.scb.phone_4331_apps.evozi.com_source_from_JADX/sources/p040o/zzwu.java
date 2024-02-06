package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzwu */
public final class zzwu {
    @SerializedName("labelTH")
    public String IconCompatParcelizer;
    @SerializedName("labelEN")
    public String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzwu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwu)) {
            return false;
        }
        zzwu zzwu = (zzwu) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzwu.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzwu.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("AppPrivacyNotice(labelEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", labelTH=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzwu(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
    }
}
