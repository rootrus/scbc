package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.row */
public final class row {
    @SerializedName("ekycMethod")
    private final String IconCompatParcelizer;
    @SerializedName("product")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("userType")
    private String read;
    @SerializedName("tilesVersion")
    public String write = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof row)) {
            return false;
        }
        row row = (row) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) row.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) row.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) row.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) row.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InitiateEkycRegistrationRequest(product=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", ekycMethod=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", userType=");
        sb.append(this.read);
        sb.append(", tilesVersion=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public row(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "product");
        onGetStartedClick.write((Object) str2, "ekycMethod");
        onGetStartedClick.write((Object) str3, "userType");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }
}
