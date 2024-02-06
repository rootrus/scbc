package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setMarker */
public final class setMarker {
    @SerializedName("id")
    public final String IconCompatParcelizer;
    @SerializedName("terminal")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("referenceOrder")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("urlLogo")
    public final String MediaDescriptionCompat;
    @SerializedName("name")
    public final String read;
    @SerializedName("code")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMarker)) {
            return false;
        }
        setMarker setmarker = (setMarker) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setmarker.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setmarker.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmarker.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmarker.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setmarker.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmarker.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantInfoEntity(id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", name=");
        sb.append(this.read);
        sb.append(", code=");
        sb.append(this.write);
        sb.append(", terminal=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", urlLogo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", referenceOrder=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
