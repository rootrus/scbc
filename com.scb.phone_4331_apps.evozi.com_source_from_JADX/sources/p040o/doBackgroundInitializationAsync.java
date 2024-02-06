package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.doBackgroundInitializationAsync */
public final class doBackgroundInitializationAsync extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<doBackgroundInitializationAsync> CREATOR = new Parcelable.Creator<doBackgroundInitializationAsync>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new doBackgroundInitializationAsync(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new doBackgroundInitializationAsync[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public List<logException> MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2816x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public Integer ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public doBackgroundInitializationAsync() {
    }

    protected doBackgroundInitializationAsync(Parcel parcel) {
        this.ParcelableVolumeInfo = Integer.valueOf(parcel.readInt());
        this.IconCompatParcelizer = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.f2816x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.createTypedArrayList(logException.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ParcelableVolumeInfo.intValue());
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.f2816x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeTypedList(this.MediaBrowserCompat$MediaItem);
    }

    public static doBackgroundInitializationAsync read() {
        return new doBackgroundInitializationAsync();
    }
}
