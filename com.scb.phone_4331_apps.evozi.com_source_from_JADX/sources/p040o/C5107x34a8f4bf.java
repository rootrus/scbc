package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.onUncaughtException;

/* renamed from: o.onUncaughtException$MediaDescriptionCompat$MediaBrowserCompat$ItemReceiver */
public final class C5107x34a8f4bf implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new onUncaughtException.MediaDescriptionCompat(parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new onUncaughtException.MediaDescriptionCompat[i];
    }
}
