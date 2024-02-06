package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Marker */
public final class Marker {
    @SerializedName("perUnit")
    public final String IconCompatParcelizer;
    @SerializedName("unit")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("everyUnit")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("code")
    public final String read;
    @SerializedName("description")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) marker.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) marker.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) marker.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) marker.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) marker.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentFrequency(code=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(", unit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", perUnit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", everyUnit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
