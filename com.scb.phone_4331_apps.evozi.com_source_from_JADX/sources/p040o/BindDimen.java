package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.BindDimen */
public final class BindDimen {
    @SerializedName("code")
    public String IconCompatParcelizer;
    @SerializedName("countryEN")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("countryTH")
    public String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindDimen)) {
            return false;
        }
        BindDimen bindDimen = (BindDimen) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) bindDimen.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) bindDimen.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) bindDimen.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryEntity(code=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", countryEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", countryTH=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
