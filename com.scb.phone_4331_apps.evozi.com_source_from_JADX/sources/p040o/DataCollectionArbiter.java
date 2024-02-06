package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.DataCollectionArbiter */
public final class DataCollectionArbiter extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3312xe9b5b08e();
    public final String IconCompatParcelizer;
    private final String Keep;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2705x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final int MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    public final int ParcelableVolumeInfo;
    private final int PlaybackStateCompat;
    private final String PlaybackStateCompat$CustomAction;
    public final String RatingCompat;
    public final String read;
    private final String setHasDecor;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionArbiter)) {
            return false;
        }
        DataCollectionArbiter dataCollectionArbiter = (DataCollectionArbiter) obj;
        return this.PlaybackStateCompat == dataCollectionArbiter.PlaybackStateCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) dataCollectionArbiter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) dataCollectionArbiter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) dataCollectionArbiter.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) dataCollectionArbiter.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) dataCollectionArbiter.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) dataCollectionArbiter.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2705x50fd9e4a, (Object) dataCollectionArbiter.f2705x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat$CustomAction, (Object) dataCollectionArbiter.PlaybackStateCompat$CustomAction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) dataCollectionArbiter.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) dataCollectionArbiter.Keep) && this.MediaBrowserCompat$MediaItem == dataCollectionArbiter.MediaBrowserCompat$MediaItem && this.MediaSessionCompat$ResultReceiverWrapper == dataCollectionArbiter.MediaSessionCompat$ResultReceiverWrapper && this.ParcelableVolumeInfo == dataCollectionArbiter.ParcelableVolumeInfo && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) dataCollectionArbiter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) dataCollectionArbiter.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) dataCollectionArbiter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) dataCollectionArbiter.MediaDescriptionCompat);
    }

    public final int hashCode() {
        int i = this.PlaybackStateCompat;
        String str = this.IconCompatParcelizer;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.setHasDecor;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$QueueItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$Token;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.f2705x50fd9e4a;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.PlaybackStateCompat$CustomAction;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.Keep;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$MediaItem;
        int i3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int i4 = this.ParcelableVolumeInfo;
        String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.RatingCompat;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.MediaDescriptionCompat;
        return (((((((((((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FundDetailsLtfDisplay(sortSequence=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", investmentYear=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currentYear=");
        sb.append(this.read);
        sb.append(", period=");
        sb.append(this.setHasDecor);
        sb.append(", maturityYear=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", units=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", totalCost=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", totalBalance=");
        sb.append(this.f2705x50fd9e4a);
        sb.append(", netGain=");
        sb.append(this.PlaybackStateCompat$CustomAction);
        sb.append(", netGainPercent=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", netGainStatus=");
        sb.append(this.Keep);
        sb.append(", parentDotDrawable=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", yearsLtfMaturity=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", yearsLtfCurrent=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", maturedCost=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", maturedUnit=");
        sb.append(this.RatingCompat);
        sb.append(", maturedAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maturedPercent=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.PlaybackStateCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.f2705x50fd9e4a);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.Keep);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
    }

    public DataCollectionArbiter(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, int i3, int i4, String str11, String str12, String str13, String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        onGetStartedClick.write((Object) str15, "investmentYear");
        onGetStartedClick.write((Object) str16, "currentYear");
        onGetStartedClick.write((Object) str17, "period");
        onGetStartedClick.write((Object) str18, "maturityYear");
        onGetStartedClick.write((Object) str19, "units");
        onGetStartedClick.write((Object) str20, "totalCost");
        onGetStartedClick.write((Object) str21, "totalBalance");
        onGetStartedClick.write((Object) str22, "netGain");
        onGetStartedClick.write((Object) str23, "netGainPercent");
        onGetStartedClick.write((Object) str24, "netGainStatus");
        onGetStartedClick.write((Object) str25, "maturedCost");
        onGetStartedClick.write((Object) str26, "maturedUnit");
        onGetStartedClick.write((Object) str27, "maturedAmount");
        onGetStartedClick.write((Object) str28, "maturedPercent");
        this.PlaybackStateCompat = i;
        this.IconCompatParcelizer = str15;
        this.read = str16;
        this.setHasDecor = str17;
        this.MediaMetadataCompat = str18;
        this.MediaSessionCompat$QueueItem = str19;
        this.MediaSessionCompat$Token = str20;
        this.f2705x50fd9e4a = str21;
        this.PlaybackStateCompat$CustomAction = str22;
        this.MediaBrowserCompat$SearchResultReceiver = str23;
        this.Keep = str24;
        this.MediaBrowserCompat$MediaItem = i2;
        this.MediaSessionCompat$ResultReceiverWrapper = i3;
        this.ParcelableVolumeInfo = i4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str25;
        this.RatingCompat = str26;
        this.MediaBrowserCompat$ItemReceiver = str27;
        this.MediaDescriptionCompat = str28;
    }
}
