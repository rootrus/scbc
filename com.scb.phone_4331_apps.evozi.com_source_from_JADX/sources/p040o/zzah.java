package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.zzah */
public final class zzah {
    @SerializedName("netAmount")
    public final String IconCompatParcelizer;
    @SerializedName("subdeposit")
    public final List<setExceptionParser> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountTo")
    public final uncaughtException MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionToken")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("totalInterest")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("totalAmount")
    public final String MediaDescriptionCompat;
    @SerializedName("totalFee")
    public final String MediaMetadataCompat;
    @SerializedName("totalTax")
    public final String RatingCompat;
    @SerializedName("annotation")
    public final paddedPartition<String> read;
    @SerializedName("accountFrom")
    public final uncaughtException write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzah = (zzah) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzah.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzah.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzah.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzah.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzah.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzah.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzah.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzah.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzah.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzah.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        uncaughtException uncaughtexception = this.write;
        int hashCode6 = uncaughtexception != null ? uncaughtexception.hashCode() : 0;
        uncaughtException uncaughtexception2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = uncaughtexception2 != null ? uncaughtexception2.hashCode() : 0;
        List<setExceptionParser> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode8 = list != null ? list.hashCode() : 0;
        paddedPartition<String> paddedpartition = this.read;
        int hashCode9 = paddedpartition != null ? paddedpartition.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FixedTransferVerificationEntity(netAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", totalAmount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", totalInterest=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", totalTax=");
        sb.append(this.RatingCompat);
        sb.append(", totalFee=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", accountFrom=");
        sb.append(this.write);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", subdeposit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", annotation=");
        sb.append(this.read);
        sb.append(", transactionToken=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }
}
