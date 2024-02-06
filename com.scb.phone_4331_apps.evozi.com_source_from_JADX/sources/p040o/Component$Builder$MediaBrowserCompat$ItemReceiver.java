package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.Component;

/* renamed from: o.Component$Builder$MediaBrowserCompat$ItemReceiver */
public final class Component$Builder$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new Component.Builder(parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new Component.Builder[i];
    }
}
