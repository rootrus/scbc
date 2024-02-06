package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.BindColor */
public final class BindColor {
    @SerializedName("countryTH")
    String MediaBrowserCompat$ItemReceiver;
    @SerializedName("code")
    String read;
    @SerializedName("countryEN")
    String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindColor)) {
            return false;
        }
        BindColor bindColor = (BindColor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) bindColor.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) bindColor.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) bindColor.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
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
        sb.append("CountryItemEntity(code=");
        sb.append(this.read);
        sb.append(", countryEN=");
        sb.append(this.write);
        sb.append(", countryTH=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
