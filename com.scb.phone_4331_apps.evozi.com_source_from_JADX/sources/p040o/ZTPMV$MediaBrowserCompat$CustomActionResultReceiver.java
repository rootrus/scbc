package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ZTPMV$MediaBrowserCompat$CustomActionResultReceiver */
public final class ZTPMV$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<ZTPMV> {
    private ZTPMV$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ ZTPMV$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ZTPMV(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ZTPMV[i];
    }
}
