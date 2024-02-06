package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.addDelayedShutdownHook$MediaBrowserCompat$ItemReceiver */
public final class addDelayedShutdownHook$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new addDelayedShutdownHook(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new addDelayedShutdownHook[i];
    }
}
