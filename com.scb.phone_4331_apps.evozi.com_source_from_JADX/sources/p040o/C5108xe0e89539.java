package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.onUncaughtException;

/* renamed from: o.onUncaughtException$MediaMetadataCompat$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5108xe0e89539 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new onUncaughtException.MediaMetadataCompat(parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new onUncaughtException.MediaMetadataCompat[i];
    }
}
