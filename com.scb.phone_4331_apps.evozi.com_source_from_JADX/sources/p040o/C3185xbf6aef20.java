package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Component$$Lambda$3$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3185xbf6aef20 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new Component$$Lambda$3(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    public final Object[] newArray(int i) {
        return new Component$$Lambda$3[i];
    }
}
