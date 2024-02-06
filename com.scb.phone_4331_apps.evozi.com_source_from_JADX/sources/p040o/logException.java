package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.logException */
public final class logException extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<logException> CREATOR = new Parcelable.Creator<logException>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new logException(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new logException[i];
        }
    };
    public int AlertController$RecycleListView;
    public String AppCompatDialogFragment;
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f2889x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public Integer PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    public String setContentView;
    public int[] setHasDecor;

    public final int describeContents() {
        return 0;
    }

    public logException() {
    }

    protected logException(Parcel parcel) {
        this.PlaybackStateCompat$CustomAction = Integer.valueOf(parcel.readInt());
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.AppCompatDialogFragment = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.f2889x50fd9e4a = parcel.readInt();
        this.AlertController$RecycleListView = parcel.readInt();
        this.Keep = parcel.readString();
        this.setContentView = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readInt();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        int[] iArr = new int[parcel.readInt()];
        this.setHasDecor = iArr;
        parcel.readIntArray(iArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.PlaybackStateCompat$CustomAction.intValue());
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.AppCompatDialogFragment);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeInt(this.AlertController$RecycleListView);
        parcel.writeInt(this.f2889x50fd9e4a);
        parcel.writeString(this.Keep);
        parcel.writeString(this.setContentView);
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeInt(this.setHasDecor.length);
        parcel.writeIntArray(this.setHasDecor);
    }

    public static logException write() {
        return new logException();
    }
}
