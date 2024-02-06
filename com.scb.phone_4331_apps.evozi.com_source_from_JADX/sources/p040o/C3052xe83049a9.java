package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEncoder$MediaBrowserCompat$ItemReceiver */
public final class C3052xe83049a9 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder(parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder[i];
    }
}
