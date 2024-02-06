package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.FirebaseApp;

/* renamed from: o.FirebaseApp$GlobalBackgroundStateListener$MediaBrowserCompat$ItemReceiver */
public final class C3373xeaea2806 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new FirebaseApp.GlobalBackgroundStateListener(parcel.readString(), parcel.readString(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new FirebaseApp.GlobalBackgroundStateListener[i];
    }
}
