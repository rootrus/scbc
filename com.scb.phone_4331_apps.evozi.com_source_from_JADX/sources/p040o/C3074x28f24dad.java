package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3074x28f24dad implements Parcelable.Creator<AutoValue_CrashlyticsReport_Session_Event_Application.C30731> {
    C3074x28f24dad() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new AutoValue_CrashlyticsReport_Session_Event_Application.C30731(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_CrashlyticsReport_Session_Event_Application.C30731[i];
    }
}
