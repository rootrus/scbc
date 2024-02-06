package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.getCustomAttributes$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4544x2fa58b2b implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        String readString = parcel.readString();
        AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = (AutoValue_CrashlyticsReport_Session_Event) AutoValue_CrashlyticsReport_Session_Event.CREATOR.createFromParcel(parcel);
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add((AutoValue_CrashlyticsReport_Session_Event_Application) AutoValue_CrashlyticsReport_Session_Event_Application.CREATOR.createFromParcel(parcel));
            readInt--;
        }
        return new getCustomAttributes(readString, autoValue_CrashlyticsReport_Session_Event, arrayList);
    }

    public final Object[] newArray(int i) {
        return new getCustomAttributes[i];
    }
}
