package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$1$MediaBrowserCompat$ItemReceiver */
public final class access$lambda$1$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return (access$lambda$1) Enum.valueOf(access$lambda$1.class, parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new access$lambda$1[i];
    }
}
