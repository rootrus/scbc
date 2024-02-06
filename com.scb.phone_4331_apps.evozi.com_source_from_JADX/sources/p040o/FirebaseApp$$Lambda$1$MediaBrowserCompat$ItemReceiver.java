package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseApp$$Lambda$1$MediaBrowserCompat$ItemReceiver */
public final class FirebaseApp$$Lambda$1$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new FirebaseApp$$Lambda$1(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    public final Object[] newArray(int i) {
        return new FirebaseApp$$Lambda$1[i];
    }
}
