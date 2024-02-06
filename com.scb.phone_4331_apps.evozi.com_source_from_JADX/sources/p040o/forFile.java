package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.forFile */
public final class forFile extends setCurrentItemInternal {
    @SerializedName("cardTitle")
    public final String IconCompatParcelizer;
    @SerializedName("netGain")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("lastUpdatedDate")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("totalBalance")
    public final String RatingCompat;
    @SerializedName("netGainPercent")
    public final String read;
    @SerializedName("iconUrl")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof forFile)) {
            return false;
        }
        forFile forfile = (forFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forfile.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) forfile.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) forfile.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) forfile.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forfile.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MutualFundsEntity(cardTitle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", iconUrl=");
        sb.append(this.write);
        sb.append(", totalBalance=");
        sb.append(this.RatingCompat);
        sb.append(", netGain=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", netGainPercent=");
        sb.append(this.read);
        sb.append(", lastUpdatedDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
