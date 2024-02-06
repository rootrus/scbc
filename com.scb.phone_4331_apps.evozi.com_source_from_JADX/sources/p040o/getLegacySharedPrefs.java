package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.getMappingFileId;

/* renamed from: o.getLegacySharedPrefs */
public final class getLegacySharedPrefs extends getMappingFileId implements Parcelable {
    public static final Parcelable.Creator<getLegacySharedPrefs> CREATOR = new Parcelable.Creator<getLegacySharedPrefs>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getLegacySharedPrefs(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getLegacySharedPrefs[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f2838x50fd9e4a;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    public boolean RatingCompat;

    /* renamed from: o.getLegacySharedPrefs$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends getMappingFileId.write<IconCompatParcelizer> {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
        public boolean MediaBrowserCompat$MediaItem;
        public boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2839x50fd9e4a;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public boolean MediaSessionCompat$ResultReceiverWrapper;
        public boolean MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public String RatingCompat;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getLegacySharedPrefs(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private getLegacySharedPrefs(IconCompatParcelizer iconCompatParcelizer) {
        super((getMappingFileId.write<?>) iconCompatParcelizer);
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaMetadataCompat;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
        this.f2838x50fd9e4a = iconCompatParcelizer.MediaSessionCompat$Token;
        this.MediaSessionCompat$QueueItem = iconCompatParcelizer.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$Token = iconCompatParcelizer.f2839x50fd9e4a;
        this.MediaMetadataCompat = iconCompatParcelizer.RatingCompat;
        this.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.ParcelableVolumeInfo;
        this.ParcelableVolumeInfo = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        this.PlaybackStateCompat = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
    }

    protected getLegacySharedPrefs(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        boolean z = false;
        this.RatingCompat = parcel.readByte() != 0;
        this.f2838x50fd9e4a = parcel.readByte() != 0;
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readInt() == 1;
        this.PlaybackStateCompat = parcel.readInt() == 1 ? true : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeByte(this.RatingCompat ? (byte) 1 : 0);
        parcel.writeByte(this.f2838x50fd9e4a ? (byte) 1 : 0);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.ParcelableVolumeInfo ? 1 : 0);
        parcel.writeInt(this.PlaybackStateCompat ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) obj;
        if (this.RatingCompat != getlegacysharedprefs.RatingCompat || this.f2838x50fd9e4a != getlegacysharedprefs.f2838x50fd9e4a || this.ParcelableVolumeInfo != getlegacysharedprefs.ParcelableVolumeInfo || this.PlaybackStateCompat != getlegacysharedprefs.PlaybackStateCompat || !this.MediaBrowserCompat$SearchResultReceiver.equals(getlegacysharedprefs.MediaBrowserCompat$SearchResultReceiver) || !this.MediaBrowserCompat$ItemReceiver.equals(getlegacysharedprefs.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? getlegacysharedprefs.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(getlegacysharedprefs.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaSessionCompat$QueueItem;
        if (str2 == null ? getlegacysharedprefs.MediaSessionCompat$QueueItem != null : !str2.equals(getlegacysharedprefs.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str3 = this.MediaSessionCompat$Token;
        if (str3 == null ? getlegacysharedprefs.MediaSessionCompat$Token != null : !str3.equals(getlegacysharedprefs.MediaSessionCompat$Token)) {
            return false;
        }
        String str4 = this.MediaMetadataCompat;
        if (str4 == null ? getlegacysharedprefs.MediaMetadataCompat != null : !str4.equals(getlegacysharedprefs.MediaMetadataCompat)) {
            return false;
        }
        String str5 = this.MediaSessionCompat$ResultReceiverWrapper;
        String str6 = getlegacysharedprefs.MediaSessionCompat$ResultReceiverWrapper;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.MediaBrowserCompat$SearchResultReceiver.hashCode();
        int hashCode3 = this.MediaBrowserCompat$ItemReceiver.hashCode();
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode4 = str != null ? str.hashCode() : 0;
        boolean z = this.RatingCompat;
        boolean z2 = this.f2838x50fd9e4a;
        String str2 = this.MediaSessionCompat$QueueItem;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$Token;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + (this.ParcelableVolumeInfo ? 1 : 0)) * 31) + (this.PlaybackStateCompat ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLandingTileDisplay{imageUrl='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", description='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", creditLimit='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", isEnabled=");
        sb.append(this.RatingCompat);
        sb.append(", isReferral=");
        sb.append(this.f2838x50fd9e4a);
        sb.append(", trapezoidText='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", productGroup='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", flowType='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", minimumIncome='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
