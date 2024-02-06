package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Device;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Device$Builder$MediaBrowserCompat$ItemReceiver */
public final class C3068x37b75801 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new AutoValue_CrashlyticsReport_Session_Device.Builder(parcel.readString(), parcel.readString(), parcel.readString(), (getManufacturer) parcel.readParcelable(AutoValue_CrashlyticsReport_Session_Device.Builder.class.getClassLoader()), (AutoValue_CrashlyticsReport_Session_Device.C30661) parcel.readParcelable(AutoValue_CrashlyticsReport_Session_Device.Builder.class.getClassLoader()));
    }

    public final Object[] newArray(int i) {
        return new AutoValue_CrashlyticsReport_Session_Device.Builder[i];
    }
}
