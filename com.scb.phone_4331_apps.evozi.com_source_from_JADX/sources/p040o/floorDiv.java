package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.floorDiv */
public final class floorDiv {
    @SerializedName("accountTo")
    public final String IconCompatParcelizer;
    @SerializedName("feeType")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("additionalMetaData")
    public final addPoints MediaBrowserCompat$ItemReceiver;
    @SerializedName("totalFee")
    public final double MediaBrowserCompat$MediaItem;
    @SerializedName("scbFee")
    public final double MediaMetadataCompat;
    @SerializedName("transactionToken")
    public final String RatingCompat;
    @SerializedName("accountFromName")
    public final String read;
    @SerializedName("accountToName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof floorDiv)) {
            return false;
        }
        floorDiv floordiv = (floorDiv) obj;
        return Double.compare(this.MediaBrowserCompat$MediaItem, floordiv.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.MediaMetadataCompat, floordiv.MediaMetadataCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) floordiv.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) floordiv.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) floordiv.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) floordiv.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) floordiv.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) floordiv.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i2 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        addPoints addpoints = this.MediaBrowserCompat$ItemReceiver;
        if (addpoints != null) {
            i3 = addpoints.hashCode();
        }
        return (((((((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NsipPartnerPaymentVerificationEntity(totalFee=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", scbFee=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", feeType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountFromName=");
        sb.append(this.read);
        sb.append(", accountTo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountToName=");
        sb.append(this.write);
        sb.append(", transactionToken=");
        sb.append(this.RatingCompat);
        sb.append(", additionalMetaDataEntity=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
