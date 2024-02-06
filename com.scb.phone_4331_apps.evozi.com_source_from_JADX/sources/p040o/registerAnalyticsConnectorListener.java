package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.registerAnalyticsConnectorListener */
public final class registerAnalyticsConnectorListener implements Parcelable {
    public static final Parcelable.Creator<registerAnalyticsConnectorListener> CREATOR = new Parcelable.Creator<registerAnalyticsConnectorListener>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new registerAnalyticsConnectorListener(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new registerAnalyticsConnectorListener[i];
        }
    };
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2926x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public registerAnalyticsConnectorListener() {
    }

    protected registerAnalyticsConnectorListener(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.f2926x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.Keep = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt() != 1 ? false : true;
        this.MediaBrowserCompat$MediaItem = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.f2926x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.Keep);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }
}
