package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.DataCollectionArbiter$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3312xe9b5b08e implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new DataCollectionArbiter(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new DataCollectionArbiter[i];
    }
}
