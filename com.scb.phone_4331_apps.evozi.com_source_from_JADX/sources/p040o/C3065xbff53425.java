package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040o.CrashlyticsReport;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Application$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3065xbff53425 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add((CrashlyticsReport.Session.OperatingSystem.Builder) parcel.readParcelable(AutoValue_CrashlyticsReport_Session_Application.class.getClassLoader()));
            readInt--;
        }
        return new AutoValue_CrashlyticsReport_Session_Application(arrayList);
    }

    public final Object[] newArray(int i) {
        return new AutoValue_CrashlyticsReport_Session_Application[i];
    }
}
