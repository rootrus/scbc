package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.SimpleTimeLimiter */
public final class SimpleTimeLimiter extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<SimpleTimeLimiter> CREATOR = new Parcelable.Creator<SimpleTimeLimiter>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SimpleTimeLimiter(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SimpleTimeLimiter[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2784x50fd9e4a;
    public List<setThreadFactory> MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public SimpleTimeLimiter() {
    }

    public static SimpleTimeLimiter MediaBrowserCompat$CustomActionResultReceiver() {
        return new SimpleTimeLimiter();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeTypedList(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.f2784x50fd9e4a);
        parcel.writeString(this.read);
    }

    protected SimpleTimeLimiter(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = parcel.createTypedArrayList(setThreadFactory.CREATOR);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.f2784x50fd9e4a = parcel.readString();
        this.read = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleTimeLimiter simpleTimeLimiter = (SimpleTimeLimiter) obj;
        String str = this.RatingCompat;
        if (str == null ? simpleTimeLimiter.RatingCompat != null : !str.equals(simpleTimeLimiter.RatingCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$MediaItem;
        if (str2 == null ? simpleTimeLimiter.MediaBrowserCompat$MediaItem != null : !str2.equals(simpleTimeLimiter.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str3 = this.ParcelableVolumeInfo;
        if (str3 == null ? simpleTimeLimiter.ParcelableVolumeInfo != null : !str3.equals(simpleTimeLimiter.ParcelableVolumeInfo)) {
            return false;
        }
        String str4 = this.MediaMetadataCompat;
        if (str4 == null ? simpleTimeLimiter.MediaMetadataCompat != null : !str4.equals(simpleTimeLimiter.MediaMetadataCompat)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 == null ? simpleTimeLimiter.MediaBrowserCompat$CustomActionResultReceiver != null : !str5.equals(simpleTimeLimiter.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 == null ? simpleTimeLimiter.MediaBrowserCompat$ItemReceiver != null : !str6.equals(simpleTimeLimiter.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str7 = this.IconCompatParcelizer;
        if (str7 == null ? simpleTimeLimiter.IconCompatParcelizer != null : !str7.equals(simpleTimeLimiter.IconCompatParcelizer)) {
            return false;
        }
        List<setThreadFactory> list = this.MediaDescriptionCompat;
        if (list == null ? simpleTimeLimiter.MediaDescriptionCompat != null : !list.equals(simpleTimeLimiter.MediaDescriptionCompat)) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str8 == null ? simpleTimeLimiter.MediaBrowserCompat$SearchResultReceiver != null : !str8.equals(simpleTimeLimiter.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str9 = this.MediaSessionCompat$Token;
        if (str9 == null ? simpleTimeLimiter.MediaSessionCompat$Token != null : !str9.equals(simpleTimeLimiter.MediaSessionCompat$Token)) {
            return false;
        }
        String str10 = this.MediaSessionCompat$QueueItem;
        if (str10 == null ? simpleTimeLimiter.MediaSessionCompat$QueueItem != null : !str10.equals(simpleTimeLimiter.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str11 = this.f2784x50fd9e4a;
        if (str11 == null ? simpleTimeLimiter.f2784x50fd9e4a != null : !str11.equals(simpleTimeLimiter.f2784x50fd9e4a)) {
            return false;
        }
        String str12 = this.read;
        String str13 = simpleTimeLimiter.read;
        if (str12 != null) {
            return str12.equals(str13);
        }
        if (str13 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ParcelableVolumeInfo;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        List<setThreadFactory> list = this.MediaDescriptionCompat;
        int hashCode8 = list != null ? list.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaSessionCompat$Token;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$QueueItem;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.f2784x50fd9e4a;
        int hashCode12 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.read;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BulkTransferReviewDisplay{groupId='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", groupName='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", scheduleMainId='");
        sb.append(this.ParcelableVolumeInfo);
        sb.append('\'');
        sb.append(", effectiveDate='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", accountFromBankIconUri='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", accountFromName='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", accountFromNumber='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", recipients=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", amount='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", totalFee='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", totalAmount='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", transactionToken='");
        sb.append(this.f2784x50fd9e4a);
        sb.append('\'');
        sb.append(", accountFromNumberOriginal='");
        sb.append(this.read);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
