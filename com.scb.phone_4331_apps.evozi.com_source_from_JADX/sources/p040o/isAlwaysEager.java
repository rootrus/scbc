package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isAlwaysEager */
public final class isAlwaysEager implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final String IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int f2871x50fd9e4a;
    public final boolean MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final String MediaSessionCompat$QueueItem;
    private final double MediaSessionCompat$ResultReceiverWrapper;
    private final String MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final boolean RatingCompat;
    public final int read;
    public final String write;

    /* renamed from: o.isAlwaysEager$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new isAlwaysEager(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new isAlwaysEager[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isAlwaysEager)) {
            return false;
        }
        isAlwaysEager isalwayseager = (isAlwaysEager) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isalwayseager.IconCompatParcelizer) && this.read == isalwayseager.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) isalwayseager.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) isalwayseager.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) isalwayseager.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) isalwayseager.ParcelableVolumeInfo) && this.f2871x50fd9e4a == isalwayseager.f2871x50fd9e4a && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) isalwayseager.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) isalwayseager.MediaBrowserCompat$SearchResultReceiver) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, isalwayseager.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.MediaSessionCompat$ResultReceiverWrapper, isalwayseager.MediaSessionCompat$ResultReceiverWrapper) == 0 && this.MediaDescriptionCompat == isalwayseager.MediaDescriptionCompat && this.RatingCompat == isalwayseager.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isalwayseager.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isalwayseager.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.read;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$QueueItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.ParcelableVolumeInfo;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        int i2 = this.f2871x50fd9e4a;
        String str6 = this.MediaSessionCompat$Token;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaSessionCompat$ResultReceiverWrapper);
        int i4 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        boolean z = this.MediaDescriptionCompat;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.RatingCompat;
        if (!z3) {
            z2 = z3;
        }
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        return (((((((((((((((((((((((((((hashCode * 31) + i) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + hashCode6) * 31) + hashCode7) * 31) + i3) * 31) + i4) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + hashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponTransactionDataDisplay(couponExpiry=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", couponTimeLimit=");
        sb.append(this.read);
        sb.append(", imageUrl=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", redemptionDate=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", refId=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", relationId=");
        sb.append(this.f2871x50fd9e4a);
        sb.append(", usedDate=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", itemCode=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", diffDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", diffMinuteSecond=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", isRedeem=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isExpired=");
        sb.append(this.RatingCompat);
        sb.append(", formattedCouponExpiry=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", formattedUsedDate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeInt(this.f2871x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeDouble(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
    }

    public isAlwaysEager(String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, String str7, double d, double d2, boolean z, boolean z2, String str8, String str9) {
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        String str15 = str9;
        onGetStartedClick.write((Object) str, "couponExpiry");
        onGetStartedClick.write((Object) str2, "imageUrl");
        onGetStartedClick.write((Object) str3, "name");
        onGetStartedClick.write((Object) str10, "redemptionDate");
        onGetStartedClick.write((Object) str11, "refId");
        onGetStartedClick.write((Object) str12, "usedDate");
        onGetStartedClick.write((Object) str13, "itemCode");
        onGetStartedClick.write((Object) str14, "formattedCouponExpiry");
        onGetStartedClick.write((Object) str15, "formattedUsedDate");
        this.IconCompatParcelizer = str;
        this.read = i;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaSessionCompat$QueueItem = str10;
        this.ParcelableVolumeInfo = str11;
        this.f2871x50fd9e4a = i2;
        this.MediaSessionCompat$Token = str12;
        this.MediaBrowserCompat$SearchResultReceiver = str13;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.MediaSessionCompat$ResultReceiverWrapper = d2;
        this.MediaDescriptionCompat = z;
        this.RatingCompat = z2;
        this.MediaBrowserCompat$ItemReceiver = str14;
        this.write = str15;
    }
}
