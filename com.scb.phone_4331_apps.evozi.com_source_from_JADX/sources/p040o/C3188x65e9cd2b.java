package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.ComponentDiscovery;

/* renamed from: o.ComponentDiscovery$MetadataRegistrarNameRetriever$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3188x65e9cd2b implements Parcelable.Creator<ComponentDiscovery.MetadataRegistrarNameRetriever> {
    private C3188x65e9cd2b() {
    }

    public /* synthetic */ C3188x65e9cd2b(byte b) {
        this();
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        return new ComponentDiscovery.MetadataRegistrarNameRetriever(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ComponentDiscovery.MetadataRegistrarNameRetriever[i];
    }
}
