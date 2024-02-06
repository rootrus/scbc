package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.parseEventDevice */
public class parseEventDevice implements Parcelable {
    public static final Parcelable.Creator<parseEventDevice> CREATOR = new Parcelable.Creator<parseEventDevice>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseEventDevice(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseEventDevice[i];
        }
    };
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public double MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public double MediaBrowserCompat$SearchResultReceiver;
    public String MediaMetadataCompat;
    public String read;
    public List<Integer> write;

    public int describeContents() {
        return 0;
    }

    public parseEventDevice() {
    }

    protected parseEventDevice(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.write = arrayList;
        parcel.readList(arrayList, (ClassLoader) null);
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt() != 1 ? false : true;
        this.read = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readDouble();
        this.MediaBrowserCompat$ItemReceiver = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
    }
}
