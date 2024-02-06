package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.factory */
public class C4416factory implements Parcelable {
    public static final Parcelable.Creator<C4416factory> CREATOR = new Parcelable.Creator<C4416factory>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C4416factory(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C4416factory[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public readStringList MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    public C4416factory() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaMetadataCompat);
        readStringList readstringlist = this.MediaBrowserCompat$SearchResultReceiver;
        parcel.writeInt(readstringlist == null ? -1 : readstringlist.ordinal());
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
    }

    protected C4416factory(Parcel parcel) {
        readStringList readstringlist;
        this.MediaMetadataCompat = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            readstringlist = null;
        } else {
            readstringlist = readStringList.values()[readInt];
        }
        this.MediaBrowserCompat$SearchResultReceiver = readstringlist;
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readByte() != 0;
    }
}
