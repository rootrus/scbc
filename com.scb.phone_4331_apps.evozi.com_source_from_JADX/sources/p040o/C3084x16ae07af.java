package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040o.C3080xc2f5febc;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder$MediaBrowserCompat$ItemReceiver */
public final class C3084x16ae07af implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        int readInt = parcel.readInt();
        boolean z = parcel.readInt() != 0;
        String readString = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        while (readInt3 != 0) {
            arrayList.add((setFrames) setFrames.CREATOR.createFromParcel(parcel));
            readInt3--;
        }
        return new C3080xc2f5febc.Builder(readInt, z, readString, readInt2, arrayList);
    }

    public final Object[] newArray(int i) {
        return new C3080xc2f5febc.Builder[i];
    }
}
