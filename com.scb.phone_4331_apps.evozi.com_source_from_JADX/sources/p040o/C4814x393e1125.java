package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.isAutomaticDataCollectionEnabled$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4814x393e1125 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        onGetStartedClick.write((Object) parcel, "in");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((setCrashlyticsDataCollectionEnabled) setCrashlyticsDataCollectionEnabled.CREATOR.createFromParcel(parcel));
                readInt--;
            }
        } else {
            arrayList = null;
        }
        return new isAutomaticDataCollectionEnabled(readString, readString2, arrayList);
    }

    public final Object[] newArray(int i) {
        return new isAutomaticDataCollectionEnabled[i];
    }
}
