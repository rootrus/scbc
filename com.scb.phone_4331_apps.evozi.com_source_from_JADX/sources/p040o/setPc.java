package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setPc */
public final class setPc implements Parcelable {
    public static final Parcelable.Creator<setPc> CREATOR = new Parcelable.Creator<setPc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setPc(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setPc[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f2957x50fd9e4a;
    private String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    private long ParcelableVolumeInfo;
    private int PlaybackStateCompat$CustomAction;
    private String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public setPc(String str, String str2, int i, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.RatingCompat = str;
        this.MediaSessionCompat$QueueItem = str2;
        this.PlaybackStateCompat$CustomAction = i;
        this.ParcelableVolumeInfo = j;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.MediaSessionCompat$ResultReceiverWrapper = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.MediaDescriptionCompat = str6;
        this.read = str7;
        this.IconCompatParcelizer = str8;
        this.MediaMetadataCompat = str9;
        this.MediaSessionCompat$Token = str10;
        this.MediaBrowserCompat$ItemReceiver = str11;
        this.f2957x50fd9e4a = str12;
        this.MediaBrowserCompat$CustomActionResultReceiver = str13;
        this.write = str14;
    }

    protected setPc(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readInt();
        this.ParcelableVolumeInfo = parcel.readLong();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.f2957x50fd9e4a = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeInt(this.PlaybackStateCompat$CustomAction);
        parcel.writeLong(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.f2957x50fd9e4a);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setPc setpc = (setPc) obj;
        if (this.PlaybackStateCompat$CustomAction != setpc.PlaybackStateCompat$CustomAction || this.ParcelableVolumeInfo != setpc.ParcelableVolumeInfo) {
            return false;
        }
        String str = this.RatingCompat;
        if (str == null ? setpc.RatingCompat != null : !str.equals(setpc.RatingCompat)) {
            return false;
        }
        String str2 = this.MediaSessionCompat$QueueItem;
        if (str2 == null ? setpc.MediaSessionCompat$QueueItem != null : !str2.equals(setpc.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null ? setpc.MediaBrowserCompat$SearchResultReceiver != null : !str3.equals(setpc.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str4 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str4 == null ? setpc.MediaSessionCompat$ResultReceiverWrapper != null : !str4.equals(setpc.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 == null ? setpc.MediaBrowserCompat$MediaItem != null : !str5.equals(setpc.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str6 = this.MediaDescriptionCompat;
        if (str6 == null ? setpc.MediaDescriptionCompat != null : !str6.equals(setpc.MediaDescriptionCompat)) {
            return false;
        }
        String str7 = this.read;
        if (str7 == null ? setpc.read != null : !str7.equals(setpc.read)) {
            return false;
        }
        String str8 = this.IconCompatParcelizer;
        if (str8 == null ? setpc.IconCompatParcelizer != null : !str8.equals(setpc.IconCompatParcelizer)) {
            return false;
        }
        String str9 = this.MediaMetadataCompat;
        if (str9 == null ? setpc.MediaMetadataCompat != null : !str9.equals(setpc.MediaMetadataCompat)) {
            return false;
        }
        String str10 = this.MediaSessionCompat$Token;
        if (str10 == null ? setpc.MediaSessionCompat$Token != null : !str10.equals(setpc.MediaSessionCompat$Token)) {
            return false;
        }
        String str11 = this.MediaBrowserCompat$ItemReceiver;
        if (str11 == null ? setpc.MediaBrowserCompat$ItemReceiver != null : !str11.equals(setpc.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str12 = this.f2957x50fd9e4a;
        if (str12 == null ? setpc.f2957x50fd9e4a != null : !str12.equals(setpc.f2957x50fd9e4a)) {
            return false;
        }
        String str13 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str13 == null ? setpc.MediaBrowserCompat$CustomActionResultReceiver != null : !str13.equals(setpc.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str14 = this.write;
        String str15 = setpc.write;
        if (str14 != null) {
            return str14.equals(str15);
        }
        if (str15 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$QueueItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = this.PlaybackStateCompat$CustomAction;
        long j = this.ParcelableVolumeInfo;
        int i2 = (int) (j ^ (j >>> 32));
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.IconCompatParcelizer;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaMetadataCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$Token;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.f2957x50fd9e4a;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.write;
        return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }
}
