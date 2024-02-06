package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.populateThreadData$MediaBrowserCompat$CustomActionResultReceiver */
public final class populateThreadData$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        if (parcel.readInt() != 0) {
            return new populateThreadData();
        }
        return null;
    }

    public final Object[] newArray(int i) {
        return new populateThreadData[i];
    }
}
