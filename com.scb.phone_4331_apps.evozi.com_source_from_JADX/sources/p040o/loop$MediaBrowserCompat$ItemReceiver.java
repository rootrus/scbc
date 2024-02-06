package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.loop$MediaBrowserCompat$ItemReceiver */
public final class loop$MediaBrowserCompat$ItemReceiver {
    @SerializedName("irFee")
    public final double IconCompatParcelizer;
    @SerializedName("interest")
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("balance")
    public final double MediaBrowserCompat$ItemReceiver;
    @SerializedName("subAttribute")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("netAmount")
    public final double MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("number")
    public final String MediaDescriptionCompat;
    @SerializedName("name")
    public final String MediaMetadataCompat;
    @SerializedName("type")
    public final String MediaSessionCompat$Token;
    @SerializedName("tax")
    public final double RatingCompat;
    @SerializedName("closingFee")
    public final double read;
    @SerializedName("branch")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loop$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        loop$MediaBrowserCompat$ItemReceiver loop_mediabrowsercompat_itemreceiver = (loop$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) loop_mediabrowsercompat_itemreceiver.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) loop_mediabrowsercompat_itemreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) loop_mediabrowsercompat_itemreceiver.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) loop_mediabrowsercompat_itemreceiver.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem) && Double.compare(this.MediaBrowserCompat$ItemReceiver, loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.RatingCompat, loop_mediabrowsercompat_itemreceiver.RatingCompat) == 0 && Double.compare(this.read, loop_mediabrowsercompat_itemreceiver.read) == 0 && Double.compare(this.IconCompatParcelizer, loop_mediabrowsercompat_itemreceiver.IconCompatParcelizer) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, loop_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver) == 0;
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$Token;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 != null) {
            i = str5.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.RatingCompat);
        long doubleToLongBits4 = Double.doubleToLongBits(this.read);
        long doubleToLongBits5 = Double.doubleToLongBits(this.IconCompatParcelizer);
        long doubleToLongBits6 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i2) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClosingAccountEntity(name=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", branch=");
        sb.append(this.write);
        sb.append(", number=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", type=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", subAttribute=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", balance=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", interest=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tax=");
        sb.append(this.RatingCompat);
        sb.append(", closingFee=");
        sb.append(this.read);
        sb.append(", irFee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", netAmount=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
