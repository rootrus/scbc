package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.lambda$intoSet$2 */
public final class lambda$intoSet$2 implements Parcelable {
    public static final Parcelable.Creator<lambda$intoSet$2> CREATOR = new Parcelable.Creator<lambda$intoSet$2>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lambda$intoSet$2(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lambda$intoSet$2[i];
        }
    };
    public String AlertController$RecycleListView;
    public Integer AppCompatActivity;
    public String AppCompatDialogFragment;
    public String IconCompatParcelizer;
    public Integer Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public readStringList MediaBrowserCompat$ItemReceiver = readStringList.NORMAL;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2885x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public Integer PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public int read;
    public String setBackgroundResource;
    public String setContentView;
    public String setHasDecor;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public lambda$intoSet$2() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeInt(this.MediaSessionCompat$QueueItem);
        parcel.writeValue(this.Keep);
        parcel.writeValue(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.setBackgroundResource);
        parcel.writeValue(this.AppCompatActivity);
        parcel.writeByte(this.MediaSessionCompat$ResultReceiverWrapper ? (byte) 1 : 0);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.setContentView);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeByte(this.f2885x50fd9e4a ? (byte) 1 : 0);
        parcel.writeInt(this.read);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver.name());
        parcel.writeByte(this.PlaybackStateCompat ? (byte) 1 : 0);
        parcel.writeString(this.AppCompatDialogFragment);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    protected lambda$intoSet$2(Parcel parcel) {
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readInt();
        this.Keep = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.PlaybackStateCompat$CustomAction = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.MediaDescriptionCompat = parcel.readString();
        this.setBackgroundResource = parcel.readString();
        this.AppCompatActivity = (Integer) parcel.readValue(Integer.class.getClassLoader());
        boolean z = true;
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readByte() != 0;
        this.AlertController$RecycleListView = parcel.readString();
        this.setContentView = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.f2885x50fd9e4a = parcel.readByte() != 0;
        this.read = parcel.readInt();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = readStringList.valueOf(parcel.readString());
        this.PlaybackStateCompat = parcel.readByte() == 0 ? false : z;
        this.AppCompatDialogFragment = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }
}
