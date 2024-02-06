package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: o.setRamUsed$MediaBrowserCompat$ItemReceiver */
public final class setRamUsed$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        HashMap hashMap;
        onGetStartedClick.write((Object) parcel, "in");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt5 = parcel.readInt();
            HashMap hashMap2 = new HashMap(readInt5);
            while (readInt5 != 0) {
                hashMap2.put(parcel.readString(), parcel.readString());
                readInt5--;
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        return new setRamUsed(readInt, readInt2, readInt3, readInt4, readString, hashMap);
    }

    public final Object[] newArray(int i) {
        return new setRamUsed[i];
    }
}
