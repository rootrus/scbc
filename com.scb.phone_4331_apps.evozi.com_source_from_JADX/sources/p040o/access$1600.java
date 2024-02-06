package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$1600 */
public final class access$1600 extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<access$1600> CREATOR = new Parcelable.Creator<access$1600>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new access$1600(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$1600[i];
        }
    };
    public String AlertController$RecycleListView;
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2795x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    public String setHasDecor;

    public final int describeContents() {
        return 0;
    }

    public access$1600() {
    }

    public static access$1600 MediaBrowserCompat$CustomActionResultReceiver() {
        return new access$1600();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.Keep);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.f2795x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
    }

    protected access$1600(Parcel parcel) {
        this.AlertController$RecycleListView = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.Keep = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.f2795x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
    }
}
