package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.DeepLinkModule */
public final class DeepLinkModule {
    @SerializedName("QRstring")
    public final String IconCompatParcelizer;
    @SerializedName("description")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("imageURL")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("type")
    public final String RatingCompat;
    @SerializedName("title")
    public final String read;
    @SerializedName("header")
    public final String write;

    public DeepLinkModule() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkModule)) {
            return false;
        }
        DeepLinkModule deepLinkModule = (DeepLinkModule) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) deepLinkModule.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) deepLinkModule.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) deepLinkModule.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) deepLinkModule.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) deepLinkModule.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) deepLinkModule.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentInfoItem(imageURL=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", header=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", type=");
        sb.append(this.RatingCompat);
        sb.append(", title=");
        sb.append(this.read);
        sb.append(", QRstring=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private DeepLinkModule(String str, String str2, String str3, String str4, String str5, String str6) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.RatingCompat = str4;
        this.read = str5;
        this.IconCompatParcelizer = str6;
    }

    private /* synthetic */ DeepLinkModule(byte b) {
        this("", "", "", "", "", "");
    }
}
