package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseNetworkException */
public final class FirebaseNetworkException implements Parcelable {
    public static final Parcelable.Creator<FirebaseNetworkException> CREATOR = new Parcelable.Creator<FirebaseNetworkException>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FirebaseNetworkException(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FirebaseNetworkException[i];
        }
    };
    public String IconCompatParcelizer;
    public Double MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public Double MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public Double read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public FirebaseNetworkException() {
    }

    protected FirebaseNetworkException(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readByte() != 0;
        this.MediaMetadataCompat = parcel.readString();
        this.RatingCompat = parcel.readString();
        if (parcel.readByte() == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.read = null;
        } else {
            this.read = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.MediaBrowserCompat$SearchResultReceiver = null;
        } else {
            this.MediaBrowserCompat$SearchResultReceiver = Double.valueOf(parcel.readDouble());
        }
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
        }
        if (this.read == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.read.doubleValue());
        }
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver.doubleValue());
        }
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
