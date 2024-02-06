package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.closeOpenSessions$MediaBrowserCompat$ItemReceiver */
public final class closeOpenSessions$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add((closeWithoutRenamingOrLog) closeWithoutRenamingOrLog.CREATOR.createFromParcel(parcel));
            readInt--;
        }
        return new closeOpenSessions(readString, arrayList);
    }

    public final Object[] newArray(int i) {
        return new closeOpenSessions[i];
    }
}
