package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.valueOrNull$MediaBrowserCompat$CustomActionResultReceiver */
public final class valueOrNull$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<valueOrNull> {
    private valueOrNull$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ valueOrNull$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new valueOrNull(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new valueOrNull[i];
    }
}
