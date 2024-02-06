package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isValue */
public final class isValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new isValue$MediaBrowserCompat$CustomActionResultReceiver();
    public final String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public final boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f2880x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$Token;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isValue)) {
            return false;
        }
        isValue isvalue = (isValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) isvalue.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isvalue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) isvalue.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isvalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2880x50fd9e4a, (Object) isvalue.f2880x50fd9e4a) && this.MediaSessionCompat$Token == isvalue.MediaSessionCompat$Token && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) isvalue.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) isvalue.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) isvalue.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isvalue.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$MediaItem == isvalue.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isvalue.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.f2880x50fd9e4a;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        int i2 = this.MediaSessionCompat$Token;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaSessionCompat$QueueItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$MediaItem;
        if (z) {
            z = true;
        }
        String str11 = this.IconCompatParcelizer;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponDetailDisplay(txnRefNo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", couponCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", imageUrl=");
        sb.append(this.RatingCompat);
        sb.append(", couponExpiry=");
        sb.append(this.read);
        sb.append(", couponExpiryFormatDate=");
        sb.append(this.write);
        sb.append(", redemptionDate=");
        sb.append(this.f2880x50fd9e4a);
        sb.append(", couponTimeLimit=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", description=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", usedDate=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", couponStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isCouponTimeSensitive=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", couponTimeSensitiveUseWithin=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.f2880x50fd9e4a);
        parcel.writeInt(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem ? 1 : 0);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public isValue(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, boolean z, String str11) {
        onGetStartedClick.write((Object) str, "txnRefNo");
        onGetStartedClick.write((Object) str2, "couponCode");
        onGetStartedClick.write((Object) str3, "imageUrl");
        onGetStartedClick.write((Object) str4, "couponExpiry");
        onGetStartedClick.write((Object) str5, "couponExpiryFormatDate");
        onGetStartedClick.write((Object) str6, "redemptionDate");
        onGetStartedClick.write((Object) str7, "name");
        onGetStartedClick.write((Object) str8, "description");
        onGetStartedClick.write((Object) str9, "usedDate");
        onGetStartedClick.write((Object) str10, "couponStatus");
        onGetStartedClick.write((Object) str11, "couponTimeSensitiveUseWithin");
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.RatingCompat = str3;
        this.read = str4;
        this.write = str5;
        this.f2880x50fd9e4a = str6;
        this.MediaSessionCompat$Token = i;
        this.MediaBrowserCompat$SearchResultReceiver = str7;
        this.MediaMetadataCompat = str8;
        this.MediaSessionCompat$QueueItem = str9;
        this.MediaBrowserCompat$ItemReceiver = str10;
        this.MediaBrowserCompat$MediaItem = z;
        this.IconCompatParcelizer = str11;
    }
}
