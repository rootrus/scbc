package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setUuid */
public final class setUuid implements Parcelable {
    public static final Parcelable.Creator<setUuid> CREATOR = new Parcelable.Creator<setUuid>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setUuid(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setUuid[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    public boolean MediaMetadataCompat;
    private String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setUuid(setUuid$MediaBrowserCompat$ItemReceiver setuuid_mediabrowsercompat_itemreceiver, byte b) {
        this(setuuid_mediabrowsercompat_itemreceiver);
    }

    private setUuid(setUuid$MediaBrowserCompat$ItemReceiver setuuid_mediabrowsercompat_itemreceiver) {
        this.RatingCompat = null;
        this.write = setuuid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = setuuid_mediabrowsercompat_itemreceiver.write;
        this.MediaBrowserCompat$MediaItem = setuuid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        this.read = setuuid_mediabrowsercompat_itemreceiver.MediaDescriptionCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = setuuid_mediabrowsercompat_itemreceiver.read;
        this.IconCompatParcelizer = setuuid_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.MediaMetadataCompat = setuuid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem;
    }

    public static setUuid$MediaBrowserCompat$ItemReceiver read() {
        return new setUuid$MediaBrowserCompat$ItemReceiver((byte) 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.write);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
    }

    protected setUuid(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaMetadataCompat = parcel.readByte() != 0;
    }
}
