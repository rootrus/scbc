package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getRoots */
public final class getRoots extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getRoots> CREATOR = new Parcelable.Creator<getRoots>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getRoots(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getRoots[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<CycleDetector> MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public getRoots() {
    }

    protected getRoots(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(CycleDetector.CREATOR);
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }
}
