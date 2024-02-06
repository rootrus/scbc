package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver */
public final class MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver {
    @SerializedName("minAmount")
    public final String IconCompatParcelizer;
    @SerializedName("maxAmount")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("frequency")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("unit")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("perUnit")
    public final String read;
    @SerializedName("amount")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver = (MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Installment(amount=");
        sb.append(this.write);
        sb.append(", frequency=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", perUnit=");
        sb.append(this.read);
        sb.append(", unit=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", minAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", maxAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
