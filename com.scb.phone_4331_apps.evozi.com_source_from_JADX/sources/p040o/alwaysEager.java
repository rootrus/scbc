package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.alwaysEager */
public final class alwaysEager implements Parcelable {
    public static final Parcelable.Creator<alwaysEager> CREATOR = new Parcelable.Creator<alwaysEager>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new alwaysEager(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new alwaysEager[i];
        }
    };
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public ComponentDiscovery MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public boolean read;
    public int write;

    public final int describeContents() {
        return 0;
    }

    private alwaysEager() {
    }

    public static alwaysEager MediaBrowserCompat$ItemReceiver() {
        return new alwaysEager();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.write);
        ComponentDiscovery componentDiscovery = this.MediaSessionCompat$QueueItem;
        parcel.writeInt(componentDiscovery == null ? -1 : componentDiscovery.ordinal());
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
    }

    protected alwaysEager(Parcel parcel) {
        ComponentDiscovery componentDiscovery;
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readInt();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.write = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            componentDiscovery = null;
        } else {
            componentDiscovery = ComponentDiscovery.values()[readInt];
        }
        this.MediaSessionCompat$QueueItem = componentDiscovery;
        boolean z = true;
        this.read = parcel.readByte() != 0;
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readByte() == 0 ? false : z;
    }
}
