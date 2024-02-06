package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachDstAtop$MediaBrowserCompat$CustomActionResultReceiver */
public final class forEachDstAtop$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<forEachDstAtop> {
    private forEachDstAtop$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ forEachDstAtop$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new forEachDstAtop(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new forEachDstAtop[i];
    }
}
