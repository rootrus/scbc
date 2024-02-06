package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AnalyticsConnectorImpl */
public final class AnalyticsConnectorImpl implements Parcelable {
    public static final Parcelable.Creator<AnalyticsConnectorImpl> CREATOR = new Parcelable.Creator<AnalyticsConnectorImpl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AnalyticsConnectorImpl(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AnalyticsConnectorImpl[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public AnalyticsConnectorImpl() {
    }

    protected AnalyticsConnectorImpl(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaMetadataCompat);
    }
}
