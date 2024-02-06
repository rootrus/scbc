package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.renderPath */
public final class renderPath {
    @SerializedName("amountFrom")
    public final Double IconCompatParcelizer;
    @SerializedName("conversionRate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("currencyCodeTo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("feeCurrencyCode")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("details")
    public final String MediaMetadataCompat;
    @SerializedName("fee")
    public final Double RatingCompat;
    @SerializedName("amountTo")
    public final Double read;
    @SerializedName("currencyCodeFrom")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof renderPath)) {
            return false;
        }
        renderPath renderpath = (renderPath) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) renderpath.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) renderpath.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) renderpath.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) renderpath.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) renderpath.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) renderpath.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) renderpath.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) renderpath.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Double d = this.IconCompatParcelizer;
        int hashCode2 = d != null ? d.hashCode() : 0;
        Double d2 = this.read;
        int hashCode3 = d2 != null ? d2.hashCode() : 0;
        String str2 = this.write;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        Double d3 = this.RatingCompat;
        int hashCode6 = d3 != null ? d3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TxnDetailsEntity(conversionRate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", amountFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", amountTo=");
        sb.append(this.read);
        sb.append(", currencyCodeFrom=");
        sb.append(this.write);
        sb.append(", currencyCodeTo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fee=");
        sb.append(this.RatingCompat);
        sb.append(", feeCurrencyCode=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", details=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }
}
