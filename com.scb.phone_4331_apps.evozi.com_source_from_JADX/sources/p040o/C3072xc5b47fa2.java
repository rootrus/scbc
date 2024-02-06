package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3072xc5b47fa2 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new C3071x65de3bd5(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new C3071x65de3bd5[i];
    }
}
