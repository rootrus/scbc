package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CrashlyticsReport;

/* renamed from: o.CrashlyticsReport$Session$Device$Builder$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3274x9373093f implements Parcelable.Creator<CrashlyticsReport.Session.Device.Builder> {
    private C3274x9373093f() {
    }

    public /* synthetic */ C3274x9373093f(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new CrashlyticsReport.Session.Device.Builder(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CrashlyticsReport.Session.Device.Builder[i];
    }
}
