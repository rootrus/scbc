package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getFilename$MediaBrowserCompat$CustomActionResultReceiver */
public final class getFilename$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new C10839getFilename(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new C10839getFilename[i];
    }
}
