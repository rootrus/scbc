package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.C3088x7e3e3ebd;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3091x4240d621 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new C3088x7e3e3ebd.Builder(parcel.readInt() != 0, parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new C3088x7e3e3ebd.Builder[i];
    }
}
