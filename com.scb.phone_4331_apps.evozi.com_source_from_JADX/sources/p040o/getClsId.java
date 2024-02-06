package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getClsId */
public final class getClsId extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getClsId> CREATOR = new Parcelable.Creator<getClsId>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getClsId(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getClsId[i];
        }
    };
    public String IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean RatingCompat;
    public boolean read;

    public final int describeContents() {
        return 0;
    }

    public getClsId() {
    }

    protected getClsId(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
        boolean z = true;
        this.RatingCompat = parcel.readByte() != 0;
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.read = parcel.readByte() != 0;
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() == 0 ? false : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeByte(this.RatingCompat ? (byte) 1 : 0);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
    }
}
