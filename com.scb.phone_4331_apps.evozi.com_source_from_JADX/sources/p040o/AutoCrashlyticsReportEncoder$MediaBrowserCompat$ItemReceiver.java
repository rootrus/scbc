package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver */
public final class AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<AutoCrashlyticsReportEncoder> {
    AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new AutoCrashlyticsReportEncoder(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoCrashlyticsReportEncoder[i];
    }
}
