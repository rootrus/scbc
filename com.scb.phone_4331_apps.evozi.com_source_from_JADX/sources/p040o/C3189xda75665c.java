package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.ComponentDiscovery;

/* renamed from: o.ComponentDiscovery$RegistrarNameRetriever$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3189xda75665c implements Parcelable.Creator<ComponentDiscovery.RegistrarNameRetriever> {
    private C3189xda75665c() {
    }

    public /* synthetic */ C3189xda75665c(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ComponentDiscovery.RegistrarNameRetriever(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ComponentDiscovery.RegistrarNameRetriever[i];
    }
}
