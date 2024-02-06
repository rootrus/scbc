package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.SolidLayer */
public final class SolidLayer {
    @SerializedName("addressAmphur")
    public final String IconCompatParcelizer;
    @SerializedName("addressFormatted")
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("addressCountryCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("addressSoi")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("addressProvince")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("addressZipCode")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2787x50fd9e4a;
    @SerializedName("addressThanon")
    public final String MediaDescriptionCompat;
    @SerializedName("addressNumber")
    public final String MediaMetadataCompat;
    @SerializedName("floorNumber")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("unitNumber")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("addressVillage")
    public final String ParcelableVolumeInfo;
    @SerializedName("addressTrok")
    public final String RatingCompat;
    @SerializedName("addressMoo")
    public final String read;
    @SerializedName("addressDistrict")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolidLayer)) {
            return false;
        }
        SolidLayer solidLayer = (SolidLayer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) solidLayer.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) solidLayer.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) solidLayer.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) solidLayer.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) solidLayer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) solidLayer.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) solidLayer.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) solidLayer.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) solidLayer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) solidLayer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) solidLayer.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) solidLayer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2787x50fd9e4a, (Object) solidLayer.f2787x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) solidLayer.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$QueueItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.ParcelableVolumeInfo;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.IconCompatParcelizer;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.write;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.f2787x50fd9e4a;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonalAddressEntity(unitNumber=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", floorNumber=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", addressNumber=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", addressVillage=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", addressMoo=");
        sb.append(this.read);
        sb.append(", addressTrok=");
        sb.append(this.RatingCompat);
        sb.append(", addressSoi=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", addressThanon=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", addressAmphur=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", addressDistrict=");
        sb.append(this.write);
        sb.append(", addressProvince=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", addressCountryCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", addressZipCode=");
        sb.append(this.f2787x50fd9e4a);
        sb.append(", addressFormatted=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
