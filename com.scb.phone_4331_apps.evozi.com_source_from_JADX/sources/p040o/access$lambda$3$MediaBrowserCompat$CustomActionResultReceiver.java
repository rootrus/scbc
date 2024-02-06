package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$3$MediaBrowserCompat$CustomActionResultReceiver */
public final class access$lambda$3$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new access$lambda$3(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0 ? (access$lambda$1) Enum.valueOf(access$lambda$1.class, parcel.readString()) : null, parcel.readInt() != 0 ? (parseApp) parseApp.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (access$lambda$6) access$lambda$6.CREATOR.createFromParcel(parcel) : null);
    }

    public final Object[] newArray(int i) {
        return new access$lambda$3[i];
    }
}
