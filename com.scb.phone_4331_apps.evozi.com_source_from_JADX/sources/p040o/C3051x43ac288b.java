package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.AutoCrashlyticsReportEncoder$CrashlyticsReportFilesPayloadEncoder$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3051x43ac288b implements Parcelable.Creator<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder> {
    C3051x43ac288b() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder[i];
    }
}
