package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setUnbindEnabled */
public final class setUnbindEnabled {
    @SerializedName("lastUpdateDate")
    public final String IconCompatParcelizer;
    @SerializedName("countryDescEn")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("countryDescTh")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("status")
    public final String read;
    @SerializedName("countryCode")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setUnbindEnabled)) {
            return false;
        }
        setUnbindEnabled setunbindenabled = (setUnbindEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setunbindenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setunbindenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setunbindenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setunbindenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setunbindenabled.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryEntity(countryCode=");
        sb.append(this.write);
        sb.append(", countryDescTh=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", countryDescEn=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", status=");
        sb.append(this.read);
        sb.append(", lastUpdateDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
