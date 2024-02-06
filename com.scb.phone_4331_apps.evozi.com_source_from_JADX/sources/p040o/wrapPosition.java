package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.wrapPosition */
public final class wrapPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public String write;

    /* renamed from: o.wrapPosition$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new wrapPosition(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new wrapPosition[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrapPosition)) {
            return false;
        }
        wrapPosition wrapposition = (wrapPosition) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) wrapposition.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) wrapposition.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) wrapposition.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) wrapposition.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) wrapposition.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) wrapposition.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) wrapposition.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) wrapposition.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) wrapposition.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) wrapposition.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) wrapposition.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) wrapposition.write);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.ParcelableVolumeInfo;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$QueueItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.IconCompatParcelizer;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.read;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaDescriptionCompat;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.write;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressDisplay(houseNumber=");
        sb.append(this.RatingCompat);
        sb.append(", unitNumber=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", floorNumber=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", addressVillage=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", addressMoo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", road=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", alley=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", addressDistrict=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", addressSubDistrict=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", addressProvince=");
        sb.append(this.read);
        sb.append(", addressZipCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", addressType=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.write);
    }

    public wrapPosition(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        onGetStartedClick.write((Object) str, "houseNumber");
        onGetStartedClick.write((Object) str2, "unitNumber");
        onGetStartedClick.write((Object) str3, "floorNumber");
        onGetStartedClick.write((Object) str4, "addressVillage");
        onGetStartedClick.write((Object) str5, "addressMoo");
        onGetStartedClick.write((Object) str6, "road");
        onGetStartedClick.write((Object) str7, "alley");
        onGetStartedClick.write((Object) str8, "addressDistrict");
        onGetStartedClick.write((Object) str9, "addressSubDistrict");
        onGetStartedClick.write((Object) str10, "addressProvince");
        onGetStartedClick.write((Object) str11, "addressZipCode");
        onGetStartedClick.write((Object) str12, "addressType");
        this.RatingCompat = str;
        this.ParcelableVolumeInfo = str2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaSessionCompat$QueueItem = str6;
        this.MediaMetadataCompat = str7;
        this.MediaBrowserCompat$ItemReceiver = str8;
        this.IconCompatParcelizer = str9;
        this.read = str10;
        this.MediaDescriptionCompat = str11;
        this.write = str12;
    }
}
