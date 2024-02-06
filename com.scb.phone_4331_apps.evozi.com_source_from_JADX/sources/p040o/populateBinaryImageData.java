package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.populateBinaryImageData */
public final class populateBinaryImageData implements Parcelable {
    public static final Parcelable.Creator<populateBinaryImageData> CREATOR = new Parcelable.Creator<populateBinaryImageData>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new populateBinaryImageData(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new populateBinaryImageData[i];
        }
    };
    public String AlertController$RecycleListView;
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public List<userDataToJson> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2920x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public boolean MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token;
    public boolean ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    public List<getMarkerFile> PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ populateBinaryImageData(C5147x5198ad67 populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver);
    }

    private populateBinaryImageData(C5147x5198ad67 populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver) {
        this.read = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.write;
        this.MediaBrowserCompat$ItemReceiver = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaSessionCompat$QueueItem = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$ResultReceiverWrapper;
        this.MediaSessionCompat$ResultReceiverWrapper = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$Token = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.ParcelableVolumeInfo;
        this.MediaDescriptionCompat = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver;
        this.RatingCompat = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
        this.PlaybackStateCompat = false;
        this.AlertController$RecycleListView = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat;
        this.MediaMetadataCompat = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        this.f2920x50fd9e4a = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.f2921x50fd9e4a;
        this.ParcelableVolumeInfo = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$Token;
        this.Keep = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.AlertController$RecycleListView;
        this.PlaybackStateCompat$CustomAction = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat$CustomAction;
        this.MediaBrowserCompat$SearchResultReceiver = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.RatingCompat;
        this.MediaBrowserCompat$MediaItem = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        this.write = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.IconCompatParcelizer = populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
    }

    protected populateBinaryImageData(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        boolean z = true;
        this.MediaSessionCompat$QueueItem = parcel.readByte() != 0;
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.createTypedArrayList(userDataToJson.CREATOR);
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.PlaybackStateCompat = parcel.readByte() != 0;
        this.AlertController$RecycleListView = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.f2920x50fd9e4a = parcel.readByte() != 0;
        this.ParcelableVolumeInfo = parcel.readByte() == 0 ? false : z;
        this.Keep = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.createTypedArrayList(getMarkerFile.CREATOR);
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeByte(this.MediaSessionCompat$QueueItem ? (byte) 1 : 0);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeTypedList(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeByte(this.PlaybackStateCompat ? (byte) 1 : 0);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeByte(this.f2920x50fd9e4a ? (byte) 1 : 0);
        parcel.writeByte(this.ParcelableVolumeInfo ? (byte) 1 : 0);
        parcel.writeString(this.Keep);
        parcel.writeTypedList(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
