package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.onUncaughtException$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5105xc5dfadc4 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Boolean bool;
        onGetStartedClick.write((Object) parcel, "in");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        if (parcel.readInt() != 0) {
            bool = Boolean.valueOf(parcel.readInt() != 0);
        } else {
            bool = null;
        }
        return new onUncaughtException$MediaBrowserCompat$ItemReceiver(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, bool);
    }

    public final Object[] newArray(int i) {
        return new onUncaughtException$MediaBrowserCompat$ItemReceiver[i];
    }
}
