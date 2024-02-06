package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.reportToJson$MediaBrowserCompat$CustomActionResultReceiver */
public final class reportToJson$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new reportToJson((IGoogleMapDelegate) Enum.valueOf(IGoogleMapDelegate.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (animateCameraWithCallback) Enum.valueOf(animateCameraWithCallback.class, parcel.readString()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
    }

    public final Object[] newArray(int i) {
        return new reportToJson[i];
    }
}
