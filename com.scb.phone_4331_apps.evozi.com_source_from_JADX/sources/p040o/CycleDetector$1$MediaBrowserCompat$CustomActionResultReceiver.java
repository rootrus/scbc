package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CycleDetector;

/* renamed from: o.CycleDetector$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class CycleDetector$1$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<CycleDetector.C33061> {
    CycleDetector$1$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new CycleDetector.C33061(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CycleDetector.C33061[i];
    }
}
