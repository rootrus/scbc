package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getCores */
public final class getCores extends makeUninterruptible implements Parcelable {
    public static final Parcelable.Creator<getCores> CREATOR = new Parcelable.Creator<getCores>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getCores(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getCores[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public setOnMyLocationChangeListener MediaDescriptionCompat;

    public final int describeContents() {
        return 0;
    }

    public static getCores read() {
        return new getCores();
    }

    public getCores() {
    }

    protected getCores(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = setOnMyLocationChangeListener.read(parcel.readString());
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(immediateCheckedFuture.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat.type);
        parcel.writeString(this.read);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }
}
