package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.usedBytes$MediaBrowserCompat$ItemReceiver */
public final class usedBytes$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new usedBytes(parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new usedBytes[i];
    }
}
