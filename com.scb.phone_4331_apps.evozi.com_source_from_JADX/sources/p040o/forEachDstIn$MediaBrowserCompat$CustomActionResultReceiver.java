package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachDstIn$MediaBrowserCompat$CustomActionResultReceiver */
public final class forEachDstIn$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<forEachDstIn> {
    forEachDstIn$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new forEachDstIn(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new forEachDstIn[i];
    }
}
