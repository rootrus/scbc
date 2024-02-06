package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.doOpenSession$MediaBrowserCompat$CustomActionResultReceiver */
public final class doOpenSession$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        while (readInt3 != 0) {
            arrayList.add((doCloseSessions) doCloseSessions.CREATOR.createFromParcel(parcel));
            readInt3--;
        }
        return new doOpenSession(readInt, readString, readInt2, arrayList);
    }

    public final Object[] newArray(int i) {
        return new doOpenSession[i];
    }
}
