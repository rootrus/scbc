package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.openSession */
public final class openSession extends getSessionFileProvider implements Parcelable {
    public static final Parcelable.Creator<openSession> CREATOR = new Parcelable.Creator<openSession>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new openSession(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new openSession[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public List<writeBeginSession> MediaBrowserCompat$SearchResultReceiver;
    public String MediaMetadataCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public openSession() {
    }

    public static openSession MediaBrowserCompat$ItemReceiver() {
        return new openSession();
    }

    protected openSession(Parcel parcel) {
        super(parcel);
        this.MediaMetadataCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.createTypedArrayList(writeBeginSession.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeTypedList(this.MediaBrowserCompat$SearchResultReceiver);
    }
}
