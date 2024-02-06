package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.onUncaughtException$MediaBrowserCompat$MediaItem$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5106x9ff5daef implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new onUncaughtException$MediaBrowserCompat$MediaItem(parcel.readInt() != 0);
    }

    public final Object[] newArray(int i) {
        return new onUncaughtException$MediaBrowserCompat$MediaItem[i];
    }
}
