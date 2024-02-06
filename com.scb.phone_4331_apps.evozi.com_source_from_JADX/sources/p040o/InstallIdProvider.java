package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.InstallIdProvider */
public final class InstallIdProvider extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<InstallIdProvider> CREATOR = new Parcelable.Creator<InstallIdProvider>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new InstallIdProvider(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new InstallIdProvider[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2727x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public Integer MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public InstallIdProvider() {
    }

    protected InstallIdProvider(Parcel parcel) {
        this.MediaSessionCompat$ResultReceiverWrapper = Integer.valueOf(parcel.readInt());
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.f2727x50fd9e4a = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper.intValue());
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.f2727x50fd9e4a);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static InstallIdProvider read() {
        return new InstallIdProvider();
    }
}
