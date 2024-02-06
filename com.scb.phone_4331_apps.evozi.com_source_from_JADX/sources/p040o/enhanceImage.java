package p040o;

import java.util.List;

/* renamed from: o.enhanceImage */
public final /* synthetic */ class enhanceImage implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ List read;
    private final /* synthetic */ CustomAdvertisingIdClient write;

    public /* synthetic */ enhanceImage(CustomAdvertisingIdClient customAdvertisingIdClient, List list) {
        this.write = customAdvertisingIdClient;
        this.read = list;
    }

    public final Object write(Object obj) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.write;
        return customAdvertisingIdClient.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver().switchMap(new createTempImageFile(customAdvertisingIdClient, this.read, (List) obj));
    }
}
