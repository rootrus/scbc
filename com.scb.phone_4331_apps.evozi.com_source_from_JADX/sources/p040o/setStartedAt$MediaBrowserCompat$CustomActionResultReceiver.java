package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CrashlyticsReport;

/* renamed from: o.setStartedAt$MediaBrowserCompat$CustomActionResultReceiver */
public final class setStartedAt$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        onGetStartedClick.write((Object) parcel2, "in");
        setStartedAt setstartedat = r2;
        setStartedAt setstartedat2 = new setStartedAt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), (CrashlyticsReport.Session.Event.Device.Builder) CrashlyticsReport.Session.Event.Device.Builder.CREATOR.createFromParcel(parcel2), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), (AutoValue_CrashlyticsReport_Session_Application) AutoValue_CrashlyticsReport_Session_Application.CREATOR.createFromParcel(parcel2), parcel.readString());
        return setstartedat;
    }

    public final Object[] newArray(int i) {
        return new setStartedAt[i];
    }
}
