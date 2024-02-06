package p040o;

import android.os.Parcel;

/* renamed from: o.ZTPSV */
public final class ZTPSV extends ZTBSV {
    public static final ZTPSV$MediaBrowserCompat$ItemReceiver CREATOR = new ZTPSV$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public ZTPSV() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ZTPSV(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }
}
