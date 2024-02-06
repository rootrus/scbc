package p040o;

import p040o.GeoDataClient;
import p040o.writeUInt64NoTag;

/* renamed from: o.isFocused */
public final /* synthetic */ class isFocused implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ GeoDataClient.BoundsMode write;

    public /* synthetic */ isFocused(GeoDataClient.BoundsMode boundsMode) {
        this.write = boundsMode;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7132hF) obj).read(this.write.MediaBrowserCompat$ItemReceiver, this.write.MediaBrowserCompat$CustomActionResultReceiver, this.write.IconCompatParcelizer);
    }
}
