package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.captureEventData$MediaBrowserCompat$CustomActionResultReceiver */
public final class captureEventData$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new captureEventData(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
    }

    public final Object[] newArray(int i) {
        return new captureEventData[i];
    }
}
