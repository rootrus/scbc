package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setOnMyLocationClickListener */
public final class setOnMyLocationClickListener {
    @SerializedName("floorNumber")
    public final String IconCompatParcelizer;
    @SerializedName("moo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("addressNumber")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("thanon")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("province")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("soi")
    public final String MediaDescriptionCompat;
    @SerializedName("unitNumber")
    public final String MediaMetadataCompat;
    @SerializedName("zipCode")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("village")
    public final String ParcelableVolumeInfo;
    @SerializedName("trok")
    public final String RatingCompat;
    @SerializedName("district")
    public final String read;
    @SerializedName("amphur")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnMyLocationClickListener)) {
            return false;
        }
        setOnMyLocationClickListener setonmylocationclicklistener = (setOnMyLocationClickListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setonmylocationclicklistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) setonmylocationclicklistener.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setonmylocationclicklistener.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setonmylocationclicklistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setonmylocationclicklistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setonmylocationclicklistener.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setonmylocationclicklistener.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setonmylocationclicklistener.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setonmylocationclicklistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setonmylocationclicklistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setonmylocationclicklistener.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) setonmylocationclicklistener.MediaSessionCompat$QueueItem);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ParcelableVolumeInfo;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$MediaItem;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.read;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.write;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaSessionCompat$QueueItem;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddress(addressNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", village=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", unitNumber=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", floorNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", moo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", trok=");
        sb.append(this.RatingCompat);
        sb.append(", soi=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", thanon=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", district=");
        sb.append(this.read);
        sb.append(", amphur=");
        sb.append(this.write);
        sb.append(", province=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", zipCode=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(")");
        return sb.toString();
    }

    public setOnMyLocationClickListener(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.ParcelableVolumeInfo = str2;
        this.MediaMetadataCompat = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.RatingCompat = str6;
        this.MediaDescriptionCompat = str7;
        this.MediaBrowserCompat$MediaItem = str8;
        this.read = str9;
        this.write = str10;
        this.MediaBrowserCompat$SearchResultReceiver = str11;
        this.MediaSessionCompat$QueueItem = str12;
    }
}
