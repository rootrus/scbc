package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getCurrentTimeMillis */
public final class getCurrentTimeMillis extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getCurrentTimeMillis> CREATOR = new Parcelable.Creator<getCurrentTimeMillis>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getCurrentTimeMillis(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getCurrentTimeMillis[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public getCurrentTimeMillis() {
    }

    public static getCurrentTimeMillis read() {
        return new getCurrentTimeMillis();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.read);
    }

    protected getCurrentTimeMillis(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.read = parcel.readString();
    }
}
