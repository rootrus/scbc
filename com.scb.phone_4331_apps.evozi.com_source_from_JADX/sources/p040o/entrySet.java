package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.entrySet */
public final class entrySet {
    @SerializedName("lineId")
    public final String IconCompatParcelizer;
    @SerializedName("departmentType")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("facebook")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("locationName")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("phoneNumber")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("locationId")
    public final String MediaDescriptionCompat;
    @SerializedName("nameTH")
    public final String MediaMetadataCompat;
    @SerializedName("shopImage")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("shopName")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("website")
    public final String MediaSessionCompat$Token;
    @SerializedName("shopType")
    public final String ParcelableVolumeInfo;
    @SerializedName("nameEN")
    public final String RatingCompat;
    @SerializedName("email")
    public final String read;
    @SerializedName("instagram")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof entrySet)) {
            return false;
        }
        entrySet entryset = (entrySet) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) entryset.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) entryset.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) entryset.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) entryset.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) entryset.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) entryset.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) entryset.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) entryset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) entryset.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) entryset.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) entryset.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) entryset.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) entryset.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) entryset.MediaSessionCompat$ResultReceiverWrapper);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.ParcelableVolumeInfo;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.IconCompatParcelizer;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaSessionCompat$Token;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaSessionCompat$QueueItem;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShopEntity(nameTH=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", nameEN=");
        sb.append(this.RatingCompat);
        sb.append(", locationId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", locationName=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", shopType=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", departmentType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(", facebook=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", instagram=");
        sb.append(this.write);
        sb.append(", lineId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", website=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", phoneNumber=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", shopImage=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", shopName=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(")");
        return sb.toString();
    }
}
