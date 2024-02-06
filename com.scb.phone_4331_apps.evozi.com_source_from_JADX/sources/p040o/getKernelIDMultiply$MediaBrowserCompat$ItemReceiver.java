package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getKernelIDMultiply$MediaBrowserCompat$ItemReceiver */
public final class getKernelIDMultiply$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<getKernelIDMultiply> {
    private getKernelIDMultiply$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ getKernelIDMultiply$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new getKernelIDMultiply(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new getKernelIDMultiply[i];
    }
}
