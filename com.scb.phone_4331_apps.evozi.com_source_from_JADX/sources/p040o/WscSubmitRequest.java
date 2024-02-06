package p040o;

import p040o.StandardTable;
import p040o.injectKtaCheckDeserializer;

/* renamed from: o.WscSubmitRequest */
public class WscSubmitRequest extends writeUInt64NoTag<injectKtaCheckDeserializer.read> {
    private final StreetViewPanoramaLink MediaBrowserCompat$ItemReceiver;
    public final logEventNoInterceptor read;
    final StandardTable.CellIterator write;

    @HmlPinActivity
    public WscSubmitRequest(logEventNoInterceptor logeventnointerceptor, StreetViewPanoramaLink streetViewPanoramaLink, RegularImmutableBiMap regularImmutableBiMap, StandardTable.CellIterator cellIterator) {
        super(regularImmutableBiMap);
        this.read = logeventnointerceptor;
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaLink;
        this.write = cellIterator;
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewPanoramaLink streetViewPanoramaLink = this.MediaBrowserCompat$ItemReceiver;
        if (!streetViewPanoramaLink.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaLink.MediaBrowserCompat$MediaItem.dispose();
        }
        streetViewPanoramaLink.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }
}
