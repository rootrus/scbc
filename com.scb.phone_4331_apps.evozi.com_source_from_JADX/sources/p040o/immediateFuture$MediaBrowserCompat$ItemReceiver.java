package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.immediateFuture$MediaBrowserCompat$ItemReceiver */
public final class immediateFuture$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new immediateFuture(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (makeChecked) Enum.valueOf(makeChecked.class, parcel.readString()), parcel.readInt() != 0);
    }

    public final Object[] newArray(int i) {
        return new immediateFuture[i];
    }
}
