package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.immediateFailedFuture$MediaBrowserCompat$ItemReceiver */
public final class immediateFailedFuture$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<immediateFailedFuture> {
    private immediateFailedFuture$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ immediateFailedFuture$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new immediateFailedFuture(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new immediateFailedFuture[i];
    }
}
