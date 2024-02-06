package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.onUncaughtException$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5104xad103b35 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add((HmlVerifyEmailSuccessfulActivity) parcel.readSerializable());
            readInt--;
        }
        return new C5103xa98770a8(arrayList);
    }

    public final Object[] newArray(int i) {
        return new C5103xa98770a8[i];
    }
}
