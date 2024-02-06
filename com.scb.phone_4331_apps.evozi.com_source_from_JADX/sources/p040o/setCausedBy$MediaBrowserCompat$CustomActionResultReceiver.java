package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setCausedBy$MediaBrowserCompat$CustomActionResultReceiver */
public final class setCausedBy$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<setCausedBy> {
    private setCausedBy$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ setCausedBy$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new setCausedBy(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new setCausedBy[i];
    }
}
