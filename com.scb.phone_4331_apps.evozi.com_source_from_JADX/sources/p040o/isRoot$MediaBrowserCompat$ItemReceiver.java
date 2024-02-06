package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isRoot$MediaBrowserCompat$ItemReceiver */
public final class isRoot$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new isRoot(parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new isRoot[i];
    }
}
