package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$1500$MediaBrowserCompat$CustomActionResultReceiver */
public final class access$1500$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<access$1500> {
    private access$1500$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ access$1500$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new access$1500(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new access$1500[i];
    }
}
