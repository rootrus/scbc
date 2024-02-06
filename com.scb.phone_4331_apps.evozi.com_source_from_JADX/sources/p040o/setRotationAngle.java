package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setRotationAngle */
public final class setRotationAngle {
    @SerializedName("currencyCodeFrom")
    public final String IconCompatParcelizer;
    @SerializedName("conversionRate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amountTo")
    public final double MediaBrowserCompat$ItemReceiver;
    @SerializedName("details")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("fee")
    public final double MediaMetadataCompat;
    @SerializedName("feeCurrencyCode")
    public final String RatingCompat;
    @SerializedName("amountFrom")
    public final double read;
    @SerializedName("currencyCodeTo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRotationAngle)) {
            return false;
        }
        setRotationAngle setrotationangle = (setRotationAngle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setrotationangle.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.read, setrotationangle.read) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, setrotationangle.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setrotationangle.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setrotationangle.write) && Double.compare(this.MediaMetadataCompat, setrotationangle.MediaMetadataCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setrotationangle.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setrotationangle.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((hashCode * 31) + i2) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + i4) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TxnDetailsEntity(conversionRate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", amountFrom=");
        sb.append(this.read);
        sb.append(", amountTo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", currencyCodeFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currencyCodeTo=");
        sb.append(this.write);
        sb.append(", fee=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", feeCurrencyCode=");
        sb.append(this.RatingCompat);
        sb.append(", details=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }
}
