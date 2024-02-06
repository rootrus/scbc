package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Device;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Device$1$MediaBrowserCompat$ItemReceiver */
public final class C3067xbf6f1037 implements Parcelable.Creator<AutoValue_CrashlyticsReport_Session_Device.C30661> {
    C3067xbf6f1037() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new AutoValue_CrashlyticsReport_Session_Device.C30661(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_CrashlyticsReport_Session_Device.C30661[i];
    }
}
