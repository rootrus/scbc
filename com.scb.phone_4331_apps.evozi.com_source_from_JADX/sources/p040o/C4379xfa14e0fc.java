package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ensureReceiverRegistered$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4379xfa14e0fc implements Parcelable.Creator<ensureReceiverRegistered> {
    private C4379xfa14e0fc() {
    }

    public /* synthetic */ C4379xfa14e0fc(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ensureReceiverRegistered(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ensureReceiverRegistered[i];
    }
}
