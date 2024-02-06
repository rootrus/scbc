package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setOverflowCount$MediaBrowserCompat$ItemReceiver */
public final class setOverflowCount$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new setOverflowCount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new setOverflowCount[i];
    }
}
