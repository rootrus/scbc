package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.eagerInDefaultApp */
public final class eagerInDefaultApp implements Parcelable {
    public static final Parcelable.Creator<eagerInDefaultApp> CREATOR = new Parcelable.Creator<eagerInDefaultApp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new eagerInDefaultApp(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new eagerInDefaultApp[i];
        }
    };
    public String IconCompatParcelizer;
    public int Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public List<validateInterface> f2820x50fd9e4a;
    public readStringList MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public boolean RatingCompat;
    public int read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public eagerInDefaultApp() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Keep);
        parcel.writeInt(this.read);
        readStringList readstringlist = this.MediaDescriptionCompat;
        parcel.writeInt(readstringlist == null ? -1 : readstringlist.ordinal());
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.write);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeTypedList(this.f2820x50fd9e4a);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.MediaSessionCompat$ResultReceiverWrapper ? (byte) 1 : 0);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
    }

    protected eagerInDefaultApp(Parcel parcel) {
        readStringList readstringlist;
        this.Keep = parcel.readInt();
        this.read = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            readstringlist = null;
        } else {
            readstringlist = readStringList.values()[readInt];
        }
        this.MediaDescriptionCompat = readstringlist;
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.write = parcel.readString();
        boolean z = true;
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.f2820x50fd9e4a = parcel.createTypedArrayList(validateInterface.CREATOR);
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() != 0;
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readByte() != 0;
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.RatingCompat = parcel.readByte() == 0 ? false : z;
    }
}
