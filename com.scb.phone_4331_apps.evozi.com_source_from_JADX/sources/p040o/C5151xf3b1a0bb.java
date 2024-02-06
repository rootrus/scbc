package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.populateSessionOperatingSystemData$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5151xf3b1a0bb implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        onGetStartedClick.write((Object) parcel, "in");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        List createStringArrayList = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((captureReportData) captureReportData.CREATOR.createFromParcel(parcel));
                readInt--;
            }
        } else {
            arrayList = null;
        }
        return new populateSessionOperatingSystemData(readString, readString2, createStringArrayList, arrayList);
    }

    public final Object[] newArray(int i) {
        return new populateSessionOperatingSystemData[i];
    }
}
