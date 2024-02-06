package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getEndedAt$MediaBrowserCompat$ItemReceiver */
public final class getEndedAt$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new getEndedAt(parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new getEndedAt[i];
    }
}
