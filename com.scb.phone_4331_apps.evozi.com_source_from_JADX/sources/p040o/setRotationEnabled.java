package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setRotationEnabled */
public final class setRotationEnabled {
    @SerializedName("accountFrom")
    public final setEntryLabelColor IconCompatParcelizer;
    @SerializedName("accountTo")
    public final setDrawHoleEnabled MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("address")
    public final List<setDrawSlicesUnderHole> MediaBrowserCompat$ItemReceiver;
    @SerializedName("nickname")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("txnDetails")
    public final setRotationAngle MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("systemLogo")
    public final String MediaDescriptionCompat;
    @SerializedName("identificationDetails")
    public final setHoleColor MediaMetadataCompat;
    @SerializedName("transactionToken")
    public final String RatingCompat;
    @SerializedName("annotation")
    public final String read;
    @SerializedName("contactDetails")
    public final setDrawSliceText write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRotationEnabled)) {
            return false;
        }
        setRotationEnabled setrotationenabled = (setRotationEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setrotationenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setrotationenabled.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setrotationenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setrotationenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setrotationenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setrotationenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setrotationenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setrotationenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setrotationenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setrotationenabled.read);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        setEntryLabelColor setentrylabelcolor = this.IconCompatParcelizer;
        int hashCode4 = setentrylabelcolor != null ? setentrylabelcolor.hashCode() : 0;
        setDrawHoleEnabled setdrawholeenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = setdrawholeenabled != null ? setdrawholeenabled.hashCode() : 0;
        setRotationAngle setrotationangle = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = setrotationangle != null ? setrotationangle.hashCode() : 0;
        setHoleColor setholecolor = this.MediaMetadataCompat;
        int hashCode7 = setholecolor != null ? setholecolor.hashCode() : 0;
        List<setDrawSlicesUnderHole> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = list != null ? list.hashCode() : 0;
        setDrawSliceText setdrawslicetext = this.write;
        int hashCode9 = setdrawslicetext != null ? setdrawslicetext.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceVerificationResponseEntity(transactionToken=");
        sb.append(this.RatingCompat);
        sb.append(", nickname=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", systemLogo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", accountFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", txnDetails=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", identificationDetails=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", address=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", contactDetails=");
        sb.append(this.write);
        sb.append(", annotation=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
