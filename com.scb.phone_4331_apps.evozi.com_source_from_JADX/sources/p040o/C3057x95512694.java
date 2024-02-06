package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport;

/* renamed from: o.AutoValue_CrashlyticsReport$Builder$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3057x95512694 implements Parcelable.Creator<AutoValue_CrashlyticsReport.Builder> {
    private C3057x95512694() {
    }

    public /* synthetic */ C3057x95512694(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new AutoValue_CrashlyticsReport.Builder(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_CrashlyticsReport.Builder[i];
    }
}
