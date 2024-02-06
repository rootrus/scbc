package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.GradientStroke */
public final class GradientStroke {
    @SerializedName("urlLogo")
    public final String IconCompatParcelizer;
    @SerializedName("merchantId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("merchantName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transNo")
    public final String read;
    @SerializedName("merchantTerminalId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientStroke)) {
            return false;
        }
        GradientStroke gradientStroke = (GradientStroke) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gradientStroke.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gradientStroke.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gradientStroke.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gradientStroke.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gradientStroke.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
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
        sb.append("ExtraDataEntity(merchantId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", merchantName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", merchantTerminalId=");
        sb.append(this.write);
        sb.append(", transNo=");
        sb.append(this.read);
        sb.append(", urlLogo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
