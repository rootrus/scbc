package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ZTPSV$MediaBrowserCompat$ItemReceiver */
public final class ZTPSV$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<ZTPSV> {
    private ZTPSV$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ ZTPSV$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ZTPSV(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ZTPSV[i];
    }
}
