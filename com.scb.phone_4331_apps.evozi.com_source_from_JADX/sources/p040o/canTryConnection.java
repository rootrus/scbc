package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.canTryConnection */
public class canTryConnection extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<canTryConnection> CREATOR = new Parcelable.Creator<canTryConnection>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new canTryConnection(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new canTryConnection[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<isDebuggerAttached> MediaBrowserCompat$ItemReceiver;
    public List<isDebuggerAttached> MediaMetadataCompat;
    private boolean RatingCompat;
    public List<isDebuggerAttached> read;

    public int describeContents() {
        return 0;
    }

    public canTryConnection(canTryConnection$MediaBrowserCompat$ItemReceiver<?> cantryconnection_mediabrowsercompat_itemreceiver) {
        this.RatingCompat = cantryconnection_mediabrowsercompat_itemreceiver.write;
        this.read = cantryconnection_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaMetadataCompat = cantryconnection_mediabrowsercompat_itemreceiver.RatingCompat;
        this.MediaBrowserCompat$ItemReceiver = cantryconnection_mediabrowsercompat_itemreceiver.read;
        this.IconCompatParcelizer = cantryconnection_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = cantryconnection_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
    }

    public canTryConnection(Parcel parcel) {
        this.RatingCompat = parcel.readByte() != 0;
        this.read = parcel.createTypedArrayList(isDebuggerAttached.CREATOR);
        this.MediaMetadataCompat = parcel.createTypedArrayList(isDebuggerAttached.CREATOR);
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(isDebuggerAttached.CREATOR);
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.RatingCompat ? (byte) 1 : 0);
        parcel.writeTypedList(this.read);
        parcel.writeTypedList(this.MediaMetadataCompat);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
