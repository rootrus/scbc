package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.determineFrom */
public final class determineFrom extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<determineFrom> CREATOR = new Parcelable.Creator<determineFrom>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new determineFrom(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new determineFrom[i];
        }
    };
    public List<waitForAutomaticDataCollectionEnabled> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public determineFrom(List<waitForAutomaticDataCollectionEnabled> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    protected determineFrom(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(waitForAutomaticDataCollectionEnabled.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }
}
