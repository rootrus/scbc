package p040o;

import android.os.Parcel;

/* renamed from: o.getKernelIDMultiply */
public final class getKernelIDMultiply extends ZTBSV {
    public static final getKernelIDMultiply$MediaBrowserCompat$ItemReceiver CREATOR = new getKernelIDMultiply$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public getKernelIDMultiply() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getKernelIDMultiply(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
    }
}
