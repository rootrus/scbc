package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setUser$MediaBrowserCompat$ItemReceiver */
public final class setUser$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new setUser(parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new setUser[i];
    }
}
