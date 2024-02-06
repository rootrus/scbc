package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setLog$MediaBrowserCompat$ItemReceiver */
public final class setLog$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new setLog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new setLog[i];
    }
}
