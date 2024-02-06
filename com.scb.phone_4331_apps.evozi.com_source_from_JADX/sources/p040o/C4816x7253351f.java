package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isDataCollectionDefaultEnabled$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4816x7253351f implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new isDataCollectionDefaultEnabled(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    public final Object[] newArray(int i) {
        return new isDataCollectionDefaultEnabled[i];
    }
}
