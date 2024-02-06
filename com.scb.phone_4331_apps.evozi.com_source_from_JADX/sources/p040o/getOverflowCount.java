package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getOverflowCount */
public final class getOverflowCount implements Parcelable {
    public static final Parcelable.Creator<getOverflowCount> CREATOR = new Parcelable.Creator<getOverflowCount>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getOverflowCount(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getOverflowCount[i];
        }
    };
    public String IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;
    public boolean write;

    public final int describeContents() {
        return 0;
    }

    public getOverflowCount() {
    }

    protected getOverflowCount(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readByte() != 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readDouble();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeByte(this.write ? (byte) 1 : 0);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
    }

    public static getOverflowCount IconCompatParcelizer() {
        return new getOverflowCount();
    }
}
