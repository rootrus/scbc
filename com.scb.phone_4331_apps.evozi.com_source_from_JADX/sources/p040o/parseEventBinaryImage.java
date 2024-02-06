package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseEventBinaryImage */
public final class parseEventBinaryImage implements Parcelable {
    public static final Parcelable.Creator<parseEventBinaryImage> CREATOR = new Parcelable.Creator<parseEventBinaryImage>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseEventBinaryImage(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseEventBinaryImage[i];
        }
    };
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public parseEventBinaryImage() {
    }

    protected parseEventBinaryImage(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }
}
