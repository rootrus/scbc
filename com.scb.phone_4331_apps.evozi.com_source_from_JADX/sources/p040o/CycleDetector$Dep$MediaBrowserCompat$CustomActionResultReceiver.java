package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CycleDetector;

/* renamed from: o.CycleDetector$Dep$MediaBrowserCompat$CustomActionResultReceiver */
public final class CycleDetector$Dep$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new CycleDetector.Dep(parcel.readString(), (requestLocationUpdates) Enum.valueOf(requestLocationUpdates.class, parcel.readString()));
    }

    public final Object[] newArray(int i) {
        return new CycleDetector.Dep[i];
    }
}
