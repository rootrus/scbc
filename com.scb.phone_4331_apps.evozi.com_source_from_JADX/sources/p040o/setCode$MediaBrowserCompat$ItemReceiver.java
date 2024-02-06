package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setCode$MediaBrowserCompat$ItemReceiver */
public final class setCode$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new setCode(parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new setCode[i];
    }
}
