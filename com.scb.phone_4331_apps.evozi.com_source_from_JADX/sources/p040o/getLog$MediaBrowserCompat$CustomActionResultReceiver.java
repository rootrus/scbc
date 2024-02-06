package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040o.AutoValue_CrashlyticsReport_Session_Device;
import p040o.getLog;

/* renamed from: o.getLog$MediaBrowserCompat$CustomActionResultReceiver */
public final class getLog$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add((getLog.read) getLog.read.CREATOR.createFromParcel(parcel));
            readInt--;
        }
        int readInt2 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt2);
        while (readInt2 != 0) {
            arrayList2.add((AutoValue_CrashlyticsReport_Session_Device.Builder) AutoValue_CrashlyticsReport_Session_Device.Builder.CREATOR.createFromParcel(parcel));
            readInt2--;
        }
        return new getLog(arrayList, arrayList2, parcel.readString(), (getRam) getRam.CREATOR.createFromParcel(parcel));
    }

    public final Object[] newArray(int i) {
        return new getLog[i];
    }
}
