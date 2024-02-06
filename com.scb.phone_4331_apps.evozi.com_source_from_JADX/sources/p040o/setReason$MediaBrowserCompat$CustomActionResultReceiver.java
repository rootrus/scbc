package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setReason$MediaBrowserCompat$CustomActionResultReceiver */
public final class setReason$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new setReason(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new setReason[i];
    }
}
