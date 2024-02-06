package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isValue$MediaBrowserCompat$CustomActionResultReceiver */
public final class isValue$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new isValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new isValue[i];
    }
}
