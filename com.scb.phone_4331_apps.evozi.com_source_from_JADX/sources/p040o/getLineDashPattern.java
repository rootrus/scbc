package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getLineDashPattern */
public final class getLineDashPattern {
    @SerializedName("title")
    public final String IconCompatParcelizer;
    @SerializedName("QRstring")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("description")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("type")
    public final String MediaDescriptionCompat;
    @SerializedName("imageURL")
    public final String read;
    @SerializedName("header")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLineDashPattern)) {
            return false;
        }
        getLineDashPattern getlinedashpattern = (getLineDashPattern) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getlinedashpattern.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlinedashpattern.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlinedashpattern.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlinedashpattern.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlinedashpattern.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlinedashpattern.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentInfoEntity(type=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", title=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", header=");
        sb.append(this.write);
        sb.append(", imageURL=");
        sb.append(this.read);
        sb.append(", QRstring=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
