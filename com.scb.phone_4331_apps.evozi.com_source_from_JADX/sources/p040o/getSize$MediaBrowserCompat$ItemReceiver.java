package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getSize$MediaBrowserCompat$ItemReceiver */
public final class getSize$MediaBrowserCompat$ItemReceiver {
    @SerializedName("email")
    public final String IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getSize$MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((getSize$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerContactInfo(email=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
