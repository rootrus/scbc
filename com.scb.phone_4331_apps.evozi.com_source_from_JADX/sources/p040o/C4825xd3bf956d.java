package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.isHandlingException$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4825xd3bf956d implements Parcelable.Creator<isHandlingException> {
    private C4825xd3bf956d() {
    }

    public /* synthetic */ C4825xd3bf956d(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new isHandlingException(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new isHandlingException[i];
    }
}
