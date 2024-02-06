package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionSignalEncoder$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3053xca4dd54e implements Parcelable.Creator<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder> {
    C3053xca4dd54e() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder[i];
    }
}
