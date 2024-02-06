package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.Utils;

/* renamed from: o.Utils$2$MediaBrowserCompat$ItemReceiver */
public final class Utils$2$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator<Utils.C39312> {
    private Utils$2$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ Utils$2$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new Utils.C39312(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Utils.C39312[i];
    }
}
