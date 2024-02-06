package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.nonNull$MediaBrowserCompat$CustomActionResultReceiver */
public final class nonNull$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<nonNull> {
    nonNull$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "source");
        return new nonNull(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nonNull[i];
    }
}
