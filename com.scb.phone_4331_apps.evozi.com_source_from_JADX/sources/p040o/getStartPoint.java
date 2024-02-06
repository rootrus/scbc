package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getStartPoint */
public final class getStartPoint {
    @SerializedName("insAcctId")
    public final String IconCompatParcelizer;
    @SerializedName("creditCardFullAmount")
    public final getGradientType MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("billPayment")
    public final GradientFill MediaBrowserCompat$ItemReceiver;
    @SerializedName("partnerSubType")
    public final List<String> MediaBrowserCompat$MediaItem;
    @SerializedName("partnerTransactionId")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("partnerName")
    public final String MediaDescriptionCompat;
    @SerializedName("partnerType")
    public final String MediaMetadataCompat;
    @SerializedName("partnerId")
    public final String RatingCompat;
    @SerializedName("merchantMetaData")
    public final getDashOffset read;
    @SerializedName("dataSource")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStartPoint)) {
            return false;
        }
        getStartPoint getstartpoint = (getStartPoint) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getstartpoint.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstartpoint.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getstartpoint.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getstartpoint.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getstartpoint.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getstartpoint.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getstartpoint.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getstartpoint.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getstartpoint.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getstartpoint.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = list != null ? list.hashCode() : 0;
        GradientFill gradientFill = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = gradientFill != null ? gradientFill.hashCode() : 0;
        getGradientType getgradienttype = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode9 = getgradienttype != null ? getgradienttype.hashCode() : 0;
        getDashOffset getdashoffset = this.read;
        if (getdashoffset != null) {
            i = getdashoffset.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InitiatePaymentEntity(insAcctId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", dataSource=");
        sb.append(this.write);
        sb.append(", partnerId=");
        sb.append(this.RatingCompat);
        sb.append(", partnerName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", partnerTransactionId=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", partnerType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", partnerSubType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", billPayment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", creditCardFullAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", merchantMetaData=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
