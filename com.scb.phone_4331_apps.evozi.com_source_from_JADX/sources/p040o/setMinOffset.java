package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setMinOffset */
public final class setMinOffset {
    @SerializedName("accountTo")
    public final setDrawHoleEnabled IconCompatParcelizer;
    @SerializedName("annotation")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("contactDetails")
    public final setDrawSliceText MediaBrowserCompat$ItemReceiver;
    @SerializedName("txnDetails")
    public final setRotationAngle MediaBrowserCompat$MediaItem;
    @SerializedName("identificationDetails")
    public final setHoleColor MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("systemLogo")
    public final String MediaDescriptionCompat;
    @SerializedName("transactionId")
    public final String MediaMetadataCompat;
    @SerializedName("transactionDateTime")
    public final String RatingCompat;
    @SerializedName("accountFrom")
    public final setEntryLabelColor read;
    @SerializedName("address")
    public final List<setDrawSlicesUnderHole> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMinOffset)) {
            return false;
        }
        setMinOffset setminoffset = (setMinOffset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setminoffset.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setminoffset.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setminoffset.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setminoffset.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setminoffset.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setminoffset.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setminoffset.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setminoffset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setminoffset.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setminoffset.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        setEntryLabelColor setentrylabelcolor = this.read;
        int hashCode3 = setentrylabelcolor != null ? setentrylabelcolor.hashCode() : 0;
        setDrawHoleEnabled setdrawholeenabled = this.IconCompatParcelizer;
        int hashCode4 = setdrawholeenabled != null ? setdrawholeenabled.hashCode() : 0;
        setRotationAngle setrotationangle = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = setrotationangle != null ? setrotationangle.hashCode() : 0;
        setHoleColor setholecolor = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = setholecolor != null ? setholecolor.hashCode() : 0;
        List<setDrawSlicesUnderHole> list = this.write;
        int hashCode7 = list != null ? list.hashCode() : 0;
        setDrawSliceText setdrawslicetext = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = setdrawslicetext != null ? setdrawslicetext.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode9 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceTransactionResponseEntity(transactionDateTime=");
        sb.append(this.RatingCompat);
        sb.append(", transactionId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", accountFrom=");
        sb.append(this.read);
        sb.append(", accountTo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", txnDetails=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", identificationDetails=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", address=");
        sb.append(this.write);
        sb.append(", contactDetails=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", annotation=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", systemLogo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }
}
