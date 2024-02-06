package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3075x82a1f0a0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new AutoValue_CrashlyticsReport_Session_Event_Application(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new AutoValue_CrashlyticsReport_Session_Event_Application[i];
    }
}
