package p040o;

import p040o.C4193ck;
import p040o.writeUInt64NoTag;

/* renamed from: o.bR */
public final /* synthetic */ class C4077bR implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4193ck.C41954 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getGeoDataClient read;

    public /* synthetic */ C4077bR(C4193ck.C41954 r1, getGeoDataClient getgeodataclient) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.read = getgeodataclient;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4193ck.this.MediaBrowserCompat$CustomActionResultReceiver(this.read, (getFrontBarcodes) obj);
    }
}
