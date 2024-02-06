package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.defaultReportUploader */
public final class defaultReportUploader extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<defaultReportUploader> CREATOR = new Parcelable.Creator<defaultReportUploader>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new defaultReportUploader(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new defaultReportUploader[i];
        }
    };
    public double IconCompatParcelizer;
    public int Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2813x50fd9e4a;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public double MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public static defaultReportUploader MediaBrowserCompat$ItemReceiver() {
        return new defaultReportUploader();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.f2813x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeDouble(this.MediaSessionCompat$QueueItem);
        parcel.writeInt(this.Keep);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeDouble(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public defaultReportUploader() {
    }

    protected defaultReportUploader(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.f2813x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readDouble();
        this.Keep = parcel.readInt();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readDouble();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readInt();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }
}
