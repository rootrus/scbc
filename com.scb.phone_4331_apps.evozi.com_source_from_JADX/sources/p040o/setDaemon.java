package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.setDaemon */
public final class setDaemon extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<setDaemon> CREATOR = new Parcelable.Creator<setDaemon>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setDaemon(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setDaemon[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2937x50fd9e4a;
    public String MediaDescriptionCompat;
    public List<ThreadFactoryBuilder> MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    private setDaemon() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.f2937x50fd9e4a);
        parcel.writeTypedList(this.MediaMetadataCompat);
    }

    protected setDaemon(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.f2937x50fd9e4a = parcel.readString();
        this.MediaMetadataCompat = parcel.createTypedArrayList(ThreadFactoryBuilder.CREATOR);
    }

    public static setDaemon IconCompatParcelizer() {
        return new setDaemon();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setDaemon setdaemon = (setDaemon) obj;
        String str = this.RatingCompat;
        if (str == null ? setdaemon.RatingCompat != null : !str.equals(setdaemon.RatingCompat)) {
            return false;
        }
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null ? setdaemon.MediaDescriptionCompat != null : !str2.equals(setdaemon.MediaDescriptionCompat)) {
            return false;
        }
        String str3 = this.MediaSessionCompat$QueueItem;
        if (str3 == null ? setdaemon.MediaSessionCompat$QueueItem != null : !str3.equals(setdaemon.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str4 = this.PlaybackStateCompat;
        if (str4 == null ? setdaemon.PlaybackStateCompat != null : !str4.equals(setdaemon.PlaybackStateCompat)) {
            return false;
        }
        String str5 = this.IconCompatParcelizer;
        if (str5 == null ? setdaemon.IconCompatParcelizer != null : !str5.equals(setdaemon.IconCompatParcelizer)) {
            return false;
        }
        String str6 = this.read;
        if (str6 == null ? setdaemon.read != null : !str6.equals(setdaemon.read)) {
            return false;
        }
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 == null ? setdaemon.MediaBrowserCompat$CustomActionResultReceiver != null : !str7.equals(setdaemon.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str8 == null ? setdaemon.MediaBrowserCompat$SearchResultReceiver != null : !str8.equals(setdaemon.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str9 = this.MediaBrowserCompat$MediaItem;
        if (str9 == null ? setdaemon.MediaBrowserCompat$MediaItem != null : !str9.equals(setdaemon.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str10 = this.MediaBrowserCompat$ItemReceiver;
        if (str10 == null ? setdaemon.MediaBrowserCompat$ItemReceiver != null : !str10.equals(setdaemon.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str11 = this.ParcelableVolumeInfo;
        if (str11 == null ? setdaemon.ParcelableVolumeInfo != null : !str11.equals(setdaemon.ParcelableVolumeInfo)) {
            return false;
        }
        String str12 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str12 == null ? setdaemon.MediaSessionCompat$ResultReceiverWrapper != null : !str12.equals(setdaemon.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str13 = this.MediaSessionCompat$Token;
        if (str13 == null ? setdaemon.MediaSessionCompat$Token != null : !str13.equals(setdaemon.MediaSessionCompat$Token)) {
            return false;
        }
        String str14 = this.f2937x50fd9e4a;
        if (str14 == null ? setdaemon.f2937x50fd9e4a != null : !str14.equals(setdaemon.f2937x50fd9e4a)) {
            return false;
        }
        List<ThreadFactoryBuilder> list = this.MediaMetadataCompat;
        List<ThreadFactoryBuilder> list2 = setdaemon.MediaMetadataCompat;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$QueueItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.PlaybackStateCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.ParcelableVolumeInfo;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaSessionCompat$Token;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.f2937x50fd9e4a;
        int hashCode14 = str14 != null ? str14.hashCode() : 0;
        List<ThreadFactoryBuilder> list = this.MediaMetadataCompat;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BulkTransferSuccessDisplay{groupName='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", groupId='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", successfulTransferSummary='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", unsuccesfulTransferSummary='");
        sb.append(this.PlaybackStateCompat);
        sb.append('\'');
        sb.append(", dateTime='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", effectiveDate='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", fromAccountName='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", fromAccountNumber='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", fromBankLogoURL='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", amount='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", totalFee='");
        sb.append(this.ParcelableVolumeInfo);
        sb.append('\'');
        sb.append(", totalAmount='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append(", remainingBalance='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", transactionId='");
        sb.append(this.f2937x50fd9e4a);
        sb.append('\'');
        sb.append(", recipients=");
        sb.append(this.MediaMetadataCompat);
        sb.append('}');
        return sb.toString();
    }
}
