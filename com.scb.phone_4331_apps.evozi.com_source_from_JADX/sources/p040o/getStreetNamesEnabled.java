package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.getStreetNamesEnabled */
public final class getStreetNamesEnabled {
    @SerializedName("accountTo")
    public final String IconCompatParcelizer;
    @SerializedName("callbackUrl")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amount")
    public final float MediaBrowserCompat$ItemReceiver;
    @SerializedName("paymentInfoList")
    public final List<SupportStreetViewPanoramaFragment> MediaBrowserCompat$MediaItem;
    @SerializedName("partnerSubType")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("ref2")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2853x50fd9e4a;
    @SerializedName("partnerTransaction")
    public final String MediaDescriptionCompat;
    @SerializedName("partnerName")
    public final String MediaMetadataCompat;
    @SerializedName("accountFrom")
    private final String MediaSessionCompat$QueueItem;
    @SerializedName("ref1")
    public final String MediaSessionCompat$Token;
    @SerializedName("ref3")
    public final String ParcelableVolumeInfo;
    @SerializedName("partnerType")
    public final String RatingCompat;
    @SerializedName("partnerId")
    public final String read;
    @SerializedName("merchantInfo")
    public final GoogleMap.OnPolylineClickListener write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStreetNamesEnabled)) {
            return false;
        }
        getStreetNamesEnabled getstreetnamesenabled = (getStreetNamesEnabled) obj;
        return Float.compare(this.MediaBrowserCompat$ItemReceiver, getstreetnamesenabled.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) getstreetnamesenabled.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getstreetnamesenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getstreetnamesenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getstreetnamesenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) getstreetnamesenabled.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2853x50fd9e4a, (Object) getstreetnamesenabled.f2853x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) getstreetnamesenabled.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getstreetnamesenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getstreetnamesenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getstreetnamesenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getstreetnamesenabled.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getstreetnamesenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstreetnamesenabled.write);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.MediaBrowserCompat$ItemReceiver);
        String str = this.MediaSessionCompat$QueueItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$Token;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.f2853x50fd9e4a;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.ParcelableVolumeInfo;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.IconCompatParcelizer;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.RatingCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        List<SupportStreetViewPanoramaFragment> list = this.MediaBrowserCompat$MediaItem;
        int hashCode11 = list != null ? list.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode12 = str11 != null ? str11.hashCode() : 0;
        GoogleMap.OnPolylineClickListener onPolylineClickListener = this.write;
        if (onPolylineClickListener != null) {
            i = onPolylineClickListener.hashCode();
        }
        return (((((((((((((((((((((((((floatToIntBits * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPaymentPartner(amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountFrom=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", partnerId=");
        sb.append(this.read);
        sb.append(", partnerName=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", partnerTransaction=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", ref1=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", ref2=");
        sb.append(this.f2853x50fd9e4a);
        sb.append(", ref3=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", accountTo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", partnerType=");
        sb.append(this.RatingCompat);
        sb.append(", partnerSubType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", paymentInfoList=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", callbackUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", merchantInfo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getStreetNamesEnabled(float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<SupportStreetViewPanoramaFragment> list, String str11, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        onGetStartedClick.write((Object) str2, "partnerId");
        onGetStartedClick.write((Object) str3, "partnerName");
        onGetStartedClick.write((Object) str4, "partnerTransaction");
        onGetStartedClick.write((Object) str5, "ref1");
        onGetStartedClick.write((Object) str9, "partnerType");
        onGetStartedClick.write((Object) str10, "partnerSubType");
        this.MediaBrowserCompat$ItemReceiver = f;
        this.MediaSessionCompat$QueueItem = str;
        this.read = str2;
        this.MediaMetadataCompat = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaSessionCompat$Token = str5;
        this.f2853x50fd9e4a = str6;
        this.ParcelableVolumeInfo = str7;
        this.IconCompatParcelizer = str8;
        this.RatingCompat = str9;
        this.MediaBrowserCompat$SearchResultReceiver = str10;
        this.MediaBrowserCompat$MediaItem = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str11;
        this.write = onPolylineClickListener;
    }
}
