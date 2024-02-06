package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.validateDependencies */
public final class validateDependencies extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<validateDependencies> CREATOR = new Parcelable.Creator<validateDependencies>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new validateDependencies(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new validateDependencies[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2973x50fd9e4a;
    public zzul MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public validateDependencies() {
    }

    public static validateDependencies IconCompatParcelizer() {
        return new validateDependencies();
    }

    protected validateDependencies(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.f2973x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.f2973x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
    }
}
