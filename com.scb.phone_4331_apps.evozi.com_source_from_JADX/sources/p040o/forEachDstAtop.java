package p040o;

import android.os.Parcel;

/* renamed from: o.forEachDstAtop */
public final class forEachDstAtop extends ZTBSV {
    public static final forEachDstAtop$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new forEachDstAtop$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);

    public final int describeContents() {
        return 0;
    }

    public forEachDstAtop() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public forEachDstAtop(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }
}
