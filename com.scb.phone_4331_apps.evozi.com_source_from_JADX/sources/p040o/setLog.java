package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setLog */
public final class setLog implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setLog$MediaBrowserCompat$ItemReceiver();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2947x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final String ParcelableVolumeInfo;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLog)) {
            return false;
        }
        setLog setlog = (setLog) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setlog.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) setlog.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setlog.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2947x50fd9e4a, (Object) setlog.f2947x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setlog.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) setlog.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setlog.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setlog.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setlog.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) setlog.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setlog.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setlog.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setlog.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setlog.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$QueueItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.f2947x50fd9e4a;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.ParcelableVolumeInfo;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.RatingCompat;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.IconCompatParcelizer;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaDescriptionCompat;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.write;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentAddressDisplay(houseNumber=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", unit=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", floor=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", village=");
        sb.append(this.f2947x50fd9e4a);
        sb.append(", moo=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", trok=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", alley=");
        sb.append(this.read);
        sb.append(", road=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", district=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", subDistrict=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", province=");
        sb.append(this.RatingCompat);
        sb.append(", countryCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", postalCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", addressFormatted=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.f2947x50fd9e4a);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.write);
    }

    public setLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaSessionCompat$QueueItem = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.f2947x50fd9e4a = str4;
        this.MediaMetadataCompat = str5;
        this.MediaSessionCompat$ResultReceiverWrapper = str6;
        this.read = str7;
        this.MediaBrowserCompat$SearchResultReceiver = str8;
        this.MediaBrowserCompat$ItemReceiver = str9;
        this.ParcelableVolumeInfo = str10;
        this.RatingCompat = str11;
        this.IconCompatParcelizer = str12;
        this.MediaDescriptionCompat = str13;
        this.write = str14;
    }
}
