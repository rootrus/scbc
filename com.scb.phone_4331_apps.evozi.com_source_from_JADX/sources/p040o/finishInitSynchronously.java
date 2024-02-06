package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.finishInitSynchronously */
public final class finishInitSynchronously implements Parcelable {
    public static final Parcelable.Creator<finishInitSynchronously> CREATOR = new Parcelable.Creator<finishInitSynchronously>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new finishInitSynchronously(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new finishInitSynchronously[i];
        }
    };
    public String[] IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int read;
    public int write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ finishInitSynchronously(finishInitSynchronously$MediaBrowserCompat$ItemReceiver finishinitsynchronously_mediabrowsercompat_itemreceiver, byte b) {
        this(finishinitsynchronously_mediabrowsercompat_itemreceiver);
    }

    private finishInitSynchronously(finishInitSynchronously$MediaBrowserCompat$ItemReceiver finishinitsynchronously_mediabrowsercompat_itemreceiver) {
        this.write = finishinitsynchronously_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = finishinitsynchronously_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public static finishInitSynchronously$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver() {
        return new finishInitSynchronously$MediaBrowserCompat$ItemReceiver((byte) 0);
    }

    protected finishInitSynchronously(Parcel parcel) {
        this.write = parcel.readInt();
        this.read = parcel.readInt();
        this.IconCompatParcelizer = parcel.createStringArray();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.write);
        parcel.writeInt(this.read);
        parcel.writeStringArray(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
