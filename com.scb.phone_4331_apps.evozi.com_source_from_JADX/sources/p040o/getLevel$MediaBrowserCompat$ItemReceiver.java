package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.getLevel$MediaBrowserCompat$ItemReceiver */
public final class getLevel$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z = parcel.readInt() != 0;
        publish publish = (publish) parcel.readParcelable(getLevel.class.getClassLoader());
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add((RestrictedComponentContainer) parcel.readParcelable(getLevel.class.getClassLoader()));
            readInt--;
        }
        return new getLevel(readString, readString2, z, publish, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new getLevel[i];
    }
}
