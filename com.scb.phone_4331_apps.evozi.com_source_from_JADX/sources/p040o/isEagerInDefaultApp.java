package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isEagerInDefaultApp */
public final class isEagerInDefaultApp implements Parcelable {
    public static final Parcelable.Creator<isEagerInDefaultApp> CREATOR = new Parcelable.Creator<isEagerInDefaultApp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new isEagerInDefaultApp(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isEagerInDefaultApp[i];
        }
    };
    public String AlertController$RecycleListView;
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public readStringList MediaBrowserCompat$SearchResultReceiver = readStringList.NORMAL;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2874x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompat$QueueItem;
    public intoSet MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public int read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public isEagerInDefaultApp() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeParcelable(this.MediaSessionCompat$ResultReceiverWrapper, i);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
        parcel.writeByte(this.MediaSessionCompat$QueueItem ? (byte) 1 : 0);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeInt(this.read);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver.name());
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.f2874x50fd9e4a);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeString(this.Keep);
    }

    protected isEagerInDefaultApp(Parcel parcel) {
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = (intoSet) parcel.readParcelable(intoSet.class.getClassLoader());
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        boolean z = true;
        this.MediaBrowserCompat$MediaItem = parcel.readByte() != 0;
        this.MediaSessionCompat$QueueItem = parcel.readByte() != 0;
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.AlertController$RecycleListView = parcel.readString();
        this.read = parcel.readInt();
        this.MediaBrowserCompat$SearchResultReceiver = readStringList.valueOf(parcel.readString());
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.f2874x50fd9e4a = parcel.readString();
        this.MediaDescriptionCompat = parcel.readByte() == 0 ? false : z;
        this.Keep = parcel.readString();
    }
}
