package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.interpolateValue */
public final class interpolateValue {
    @SerializedName("displayName")
    public final String IconCompatParcelizer;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("personalInfoRemark")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("mailingAddress")
    public final List<String> MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("transactionToken")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2869x50fd9e4a;
    @SerializedName("issuingFee")
    public final String MediaDescriptionCompat;
    @SerializedName("fee")
    public final String MediaMetadataCompat;
    @SerializedName("requestType")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("prepaidCardName")
    public final String RatingCompat;
    @SerializedName("annualFee")
    public final String read;
    @SerializedName("deliveryFee")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof interpolateValue)) {
            return false;
        }
        interpolateValue interpolatevalue = (interpolateValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) interpolatevalue.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) interpolatevalue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) interpolatevalue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) interpolatevalue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) interpolatevalue.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) interpolatevalue.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) interpolatevalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) interpolatevalue.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) interpolatevalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) interpolatevalue.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2869x50fd9e4a, (Object) interpolatevalue.f2869x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) interpolatevalue.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$QueueItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode10 = list != null ? list.hashCode() : 0;
        String str10 = this.f2869x50fd9e4a;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$MediaItem;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestVerificationEntity(requestType=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", displayName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", prepaidCardName=");
        sb.append(this.RatingCompat);
        sb.append(", fee=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", annualFee=");
        sb.append(this.read);
        sb.append(", issuingFee=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", deliveryFee=");
        sb.append(this.write);
        sb.append(", mailingAddress=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transactionToken=");
        sb.append(this.f2869x50fd9e4a);
        sb.append(", personalInfoRemark=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }
}
