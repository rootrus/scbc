package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getBytesForLog */
public final class getBytesForLog implements Parcelable {
    public static final Parcelable.Creator<getBytesForLog> CREATOR = new Parcelable.Creator<getBytesForLog>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getBytesForLog(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getBytesForLog[i];
        }
    };
    public int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    private String MediaMetadataCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public getBytesForLog() {
    }

    protected getBytesForLog(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.IconCompatParcelizer);
    }
}
