package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.intoSetBuilder */
public final class intoSetBuilder implements Parcelable {
    public static final Parcelable.Creator<intoSetBuilder> CREATOR = new Parcelable.Creator<intoSetBuilder>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new intoSetBuilder(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new intoSetBuilder[i];
        }
    };
    public String IconCompatParcelizer;
    public Integer MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public readStringList MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public readString MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public boolean RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public static intoSetBuilder IconCompatParcelizer() {
        return new intoSetBuilder();
    }

    private intoSetBuilder() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaSessionCompat$Token);
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = -1;
        parcel.writeInt(num == null ? -1 : num.intValue());
        parcel.writeString(this.ParcelableVolumeInfo);
        readString readstring = this.MediaSessionCompat$QueueItem;
        parcel.writeInt(readstring == null ? -1 : readstring.ordinal());
        readStringList readstringlist = this.MediaBrowserCompat$MediaItem;
        if (readstringlist != null) {
            i2 = readstringlist.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.write);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
    }

    protected intoSetBuilder(Parcel parcel) {
        Integer num;
        readString readstring;
        this.MediaSessionCompat$Token = parcel.readString();
        int readInt = parcel.readInt();
        readStringList readstringlist = null;
        if (readInt == -1) {
            num = null;
        } else {
            num = Integer.valueOf(readInt);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
        this.ParcelableVolumeInfo = parcel.readString();
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            readstring = null;
        } else {
            readstring = readString.values()[readInt2];
        }
        this.MediaSessionCompat$QueueItem = readstring;
        int readInt3 = parcel.readInt();
        this.MediaBrowserCompat$MediaItem = readInt3 != -1 ? readStringList.values()[readInt3] : readstringlist;
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.write = parcel.readString();
        this.RatingCompat = parcel.readInt() != 1 ? false : true;
    }
}
