package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ComponentFactory$MediaBrowserCompat$CustomActionResultReceiver */
public final class ComponentFactory$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<ComponentFactory> {
    private ComponentFactory$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ ComponentFactory$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ComponentFactory(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ComponentFactory[i];
    }
}
