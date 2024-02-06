package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ringWrite$MediaBrowserCompat$ItemReceiver */
public final class ringWrite$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new ringWrite(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
    }

    public final Object[] newArray(int i) {
        return new ringWrite[i];
    }
}
