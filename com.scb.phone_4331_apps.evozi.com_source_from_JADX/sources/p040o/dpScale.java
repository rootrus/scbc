package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.dpScale */
public final class dpScale {
    @SerializedName("promptpayID")
    public final String IconCompatParcelizer;
    @SerializedName("logo")
    public final String read;
    @SerializedName("name")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpScale)) {
            return false;
        }
        dpScale dpscale = (dpScale) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) dpscale.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) dpscale.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) dpscale.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountToEntity(logo=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.write);
        sb.append(", promptpayID=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
