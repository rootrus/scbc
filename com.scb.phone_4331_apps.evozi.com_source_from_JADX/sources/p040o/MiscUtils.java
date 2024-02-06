package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.MiscUtils */
public final class MiscUtils {
    @SerializedName("merchantMetaData")
    public final parseParameters IconCompatParcelizer;
    @SerializedName("partnerId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amount")
    public final double MediaBrowserCompat$ItemReceiver;
    @SerializedName("partnerType")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("partnerTransactionId")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("ref3")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2760x50fd9e4a;
    @SerializedName("partnerName")
    public final String MediaDescriptionCompat;
    @SerializedName("partnerSubType")
    public final String MediaMetadataCompat;
    @SerializedName("ref1_label")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("ref2")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("ref3_label")
    public final String MediaSessionCompat$Token;
    @SerializedName("ref2_label")
    public final String ParcelableVolumeInfo;
    @SerializedName("ref1")
    public final String RatingCompat;
    @SerializedName("accountTo")
    public final String read;
    @SerializedName("accountFrom")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiscUtils)) {
            return false;
        }
        MiscUtils miscUtils = (MiscUtils) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) miscUtils.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) miscUtils.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) miscUtils.MediaBrowserCompat$SearchResultReceiver) && Double.compare(this.MediaBrowserCompat$ItemReceiver, miscUtils.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) miscUtils.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) miscUtils.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) miscUtils.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) miscUtils.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) miscUtils.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) miscUtils.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) miscUtils.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2760x50fd9e4a, (Object) miscUtils.f2760x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) miscUtils.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) miscUtils.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) miscUtils.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$QueueItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.ParcelableVolumeInfo;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaSessionCompat$Token;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.RatingCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.f2760x50fd9e4a;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaBrowserCompat$MediaItem;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaMetadataCompat;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        parseParameters parseparameters = this.IconCompatParcelizer;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (parseparameters != null ? parseparameters.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NSipPartnerPaymentEntity(partnerId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", partnerName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", partnerTransactionId=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountFrom=");
        sb.append(this.write);
        sb.append(", accountTo=");
        sb.append(this.read);
        sb.append(", ref1_label=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", ref2_label=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", ref3_label=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", ref1=");
        sb.append(this.RatingCompat);
        sb.append(", ref2=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", ref3=");
        sb.append(this.f2760x50fd9e4a);
        sb.append(", partnerType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", partnerSubType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", merchantMetaData=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
