package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.discover */
public final class C4283discover implements Parcelable {
    public static final Parcelable.Creator<C4283discover> CREATOR = new Parcelable.Creator<C4283discover>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C4283discover(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C4283discover[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public int read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public C4283discover() {
    }

    protected C4283discover(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.read = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeInt(this.read);
    }
}
