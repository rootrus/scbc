package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ComponentRuntime$MediaBrowserCompat$CustomActionResultReceiver */
public final class ComponentRuntime$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<ComponentRuntime> {
    private ComponentRuntime$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ ComponentRuntime$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ComponentRuntime(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ComponentRuntime[i];
    }
}
