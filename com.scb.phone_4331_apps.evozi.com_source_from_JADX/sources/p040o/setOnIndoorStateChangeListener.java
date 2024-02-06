package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setOnIndoorStateChangeListener */
public final class setOnIndoorStateChangeListener {
    @SerializedName("title")
    public final String IconCompatParcelizer;
    @SerializedName("description")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("imageURL")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("type")
    public final String MediaDescriptionCompat;
    @SerializedName("QRstring")
    public final String read;
    @SerializedName("header")
    public final String write;

    public setOnIndoorStateChangeListener() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnIndoorStateChangeListener)) {
            return false;
        }
        setOnIndoorStateChangeListener setonindoorstatechangelistener = (setOnIndoorStateChangeListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setonindoorstatechangelistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setonindoorstatechangelistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setonindoorstatechangelistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setonindoorstatechangelistener.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setonindoorstatechangelistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setonindoorstatechangelistener.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentInfo(imageURL=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", header=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", type=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", title=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", QRstring=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setOnIndoorStateChangeListener(String str, String str2, String str3, String str4, String str5, String str6) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaDescriptionCompat = str4;
        this.IconCompatParcelizer = str5;
        this.read = str6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setOnIndoorStateChangeListener(String str, String str2, String str3, String str4, String str5, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (String) null);
    }
}
