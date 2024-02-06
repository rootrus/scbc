package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$1 */
public enum access$lambda$1 implements Parcelable {
    TRANSFER,
    OTHERS;
    
    public static final Parcelable.Creator CREATOR = null;

    static {
        CREATOR = new access$lambda$1$MediaBrowserCompat$ItemReceiver();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(name());
    }
}
