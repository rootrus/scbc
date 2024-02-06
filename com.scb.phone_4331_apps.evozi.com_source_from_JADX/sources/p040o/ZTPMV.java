package p040o;

import android.os.Parcel;

/* renamed from: o.ZTPMV */
public final class ZTPMV extends ZTBSV {
    public static final ZTPMV$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new ZTPMV$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);

    public ZTPMV() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ZTPMV(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }
}
