package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBackendId$MediaBrowserCompat$ItemReceiver */
final class getBackendId$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontBarcodes> {
    private /* synthetic */ getBackendId IconCompatParcelizer;
    private /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    getBackendId$MediaBrowserCompat$ItemReceiver(List list, List list2, getBackendId getbackendid) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.IconCompatParcelizer = getbackendid;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFrontBarcodes getfrontbarcodes = (getFrontBarcodes) obj;
        getfrontbarcodes.IconCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer((PlacePhotoMetadataResult) this.MediaBrowserCompat$ItemReceiver.get(0)));
        getfrontbarcodes.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
