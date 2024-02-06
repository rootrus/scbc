package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.BackgroundPriorityRunnable$MediaBrowserCompat$ItemReceiver */
public final class BackgroundPriorityRunnable$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        if (parcel.readInt() != 0) {
            return new BackgroundPriorityRunnable();
        }
        return null;
    }

    public final Object[] newArray(int i) {
        return new BackgroundPriorityRunnable[i];
    }
}
