package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.setDiskSpace;

/* renamed from: o.setDiskSpace$write$MediaBrowserCompat$ItemReceiver */
public final class setDiskSpace$write$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new setDiskSpace.write(parcel.readDouble(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new setDiskSpace.write[i];
    }
}
