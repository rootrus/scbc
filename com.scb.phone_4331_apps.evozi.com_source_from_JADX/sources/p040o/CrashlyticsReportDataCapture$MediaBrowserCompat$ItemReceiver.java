package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.CrashlyticsReportDataCapture$MediaBrowserCompat$ItemReceiver */
public final class CrashlyticsReportDataCapture$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new CrashlyticsReportDataCapture(parcel.readInt() != 0, parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new CrashlyticsReportDataCapture[i];
    }
}
