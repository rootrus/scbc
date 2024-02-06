package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getFrames$MediaBrowserCompat$CustomActionResultReceiver */
public final class getFrames$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new getFrames(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ComponentFactory) parcel.readParcelable(getFrames.class.getClassLoader()));
    }

    public final Object[] newArray(int i) {
        return new getFrames[i];
    }
}
