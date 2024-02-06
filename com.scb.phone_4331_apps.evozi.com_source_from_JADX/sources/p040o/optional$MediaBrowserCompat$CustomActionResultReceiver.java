package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.optional$MediaBrowserCompat$CustomActionResultReceiver */
public final class optional$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new C10854optional(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new C10854optional[i];
    }
}
