package p040o;

import java.util.List;

/* renamed from: o.getImageFileMetadata */
public final /* synthetic */ class getImageFileMetadata implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomAdvertisingIdClient MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getImageFileMetadata(CustomAdvertisingIdClient customAdvertisingIdClient) {
        this.MediaBrowserCompat$ItemReceiver = customAdvertisingIdClient;
    }

    public final Object write(Object obj) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.MediaBrowserCompat$ItemReceiver;
        return customAdvertisingIdClient.MediaBrowserCompat$MediaItem.read().switchMap(new enhanceImage(customAdvertisingIdClient, (List) obj));
    }
}
