package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getTimestamp$MediaBrowserCompat$ItemReceiver */
public final class getTimestamp$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new getTimestamp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new getTimestamp[i];
    }
}
