package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getCreateReportSpiCall$MediaBrowserCompat$ItemReceiver */
public final class getCreateReportSpiCall$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new getCreateReportSpiCall(parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new getCreateReportSpiCall[i];
    }
}
