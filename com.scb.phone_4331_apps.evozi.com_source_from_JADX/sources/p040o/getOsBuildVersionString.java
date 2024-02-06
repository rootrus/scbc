package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getOsBuildVersionString */
public final class getOsBuildVersionString extends doBackgroundInitialization implements Parcelable {
    public static final Parcelable.Creator<getOsBuildVersionString> CREATOR = new Parcelable.Creator<getOsBuildVersionString>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getOsBuildVersionString(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getOsBuildVersionString[i];
        }
    };
    public String AlertController$RecycleListView;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getOsBuildVersionString(getOsBuildVersionString$MediaBrowserCompat$ItemReceiver getosbuildversionstring_mediabrowsercompat_itemreceiver, byte b) {
        this(getosbuildversionstring_mediabrowsercompat_itemreceiver);
    }

    private getOsBuildVersionString(getOsBuildVersionString$MediaBrowserCompat$ItemReceiver getosbuildversionstring_mediabrowsercompat_itemreceiver) {
        this.MediaSessionCompat$Token = getosbuildversionstring_mediabrowsercompat_itemreceiver.Keep;
        this.RatingCompat = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaSessionCompat$ResultReceiverWrapper;
        this.MediaSessionCompat$QueueItem = getosbuildversionstring_mediabrowsercompat_itemreceiver.AlertController$RecycleListView;
        this.PlaybackStateCompat = getosbuildversionstring_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.MediaSessionCompat$ResultReceiverWrapper = getosbuildversionstring_mediabrowsercompat_itemreceiver.ParcelableVolumeInfo;
        this.MediaMetadataCompat = getosbuildversionstring_mediabrowsercompat_itemreceiver.RatingCompat;
        this.f2815x50fd9e4a = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaSessionCompat$QueueItem;
        this.ParcelableVolumeInfo = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaSessionCompat$Token;
        this.IconCompatParcelizer = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaDescriptionCompat;
        this.MediaBrowserCompat$ItemReceiver = getosbuildversionstring_mediabrowsercompat_itemreceiver.read;
        this.read = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = getosbuildversionstring_mediabrowsercompat_itemreceiver.f5539x50fd9e4a;
        this.MediaDescriptionCompat = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaMetadataCompat;
        this.setHasDecor = getosbuildversionstring_mediabrowsercompat_itemreceiver.PlaybackStateCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        this.PlaybackStateCompat$CustomAction = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        this.AlertController$RecycleListView = getosbuildversionstring_mediabrowsercompat_itemreceiver.write;
        this.MediaBrowserCompat$MediaItem = getosbuildversionstring_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem;
    }

    protected getOsBuildVersionString(Parcel parcel) {
        super(parcel);
        this.PlaybackStateCompat = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
    }

    public static getOsBuildVersionString$MediaBrowserCompat$ItemReceiver MediaSessionCompat$QueueItem() {
        return new getOsBuildVersionString$MediaBrowserCompat$ItemReceiver();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.AlertController$RecycleListView);
    }
}
