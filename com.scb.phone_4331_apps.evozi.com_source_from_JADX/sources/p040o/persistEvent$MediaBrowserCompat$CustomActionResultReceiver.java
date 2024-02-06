package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.persistEvent$MediaBrowserCompat$CustomActionResultReceiver */
public final class persistEvent$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<persistEvent> {
    private persistEvent$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ persistEvent$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new persistEvent(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new persistEvent[i];
    }
}
