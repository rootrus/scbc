package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.requiredProvider */
public final class requiredProvider extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<requiredProvider> CREATOR = new Parcelable.Creator<requiredProvider>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new requiredProvider(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new requiredProvider[i];
        }
    };
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2929x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public requiredProvider() {
    }

    protected requiredProvider(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.f2929x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.read = parcel.readString();
        boolean z = false;
        this.MediaDescriptionCompat = parcel.readInt() == 1;
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt() == 1;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt() == 1 ? true : z;
    }

    public static requiredProvider read() {
        return new requiredProvider();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.f2929x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.read);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver ? 1 : 0);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
    }
}
