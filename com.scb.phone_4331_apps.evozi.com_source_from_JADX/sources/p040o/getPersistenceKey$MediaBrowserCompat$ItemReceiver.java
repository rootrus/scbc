package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040o.FirebaseApp;

/* renamed from: o.getPersistenceKey$MediaBrowserCompat$ItemReceiver */
public final class getPersistenceKey$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        onGetStartedClick.write((Object) parcel2, "in");
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((FirebaseException) FirebaseException.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
        } else {
            arrayList = null;
        }
        return new getPersistenceKey(arrayList, (FirebaseApp.UiExecutor) parcel2.readParcelable(getPersistenceKey.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new getPersistenceKey[i];
    }
}
