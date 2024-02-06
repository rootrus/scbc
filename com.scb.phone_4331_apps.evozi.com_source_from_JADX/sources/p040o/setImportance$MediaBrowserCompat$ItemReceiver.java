package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setImportance$MediaBrowserCompat$ItemReceiver */
public final class setImportance$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        onGetStartedClick.write((Object) parcel2, "in");
        return new setImportance(parcel.readString(), (setOverflowCount) setOverflowCount.CREATOR.createFromParcel(parcel2), (setReason) setReason.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    public final Object[] newArray(int i) {
        return new setImportance[i];
    }
}
