package p040o;

import java.util.List;

/* renamed from: o.createTempImageFile */
public final /* synthetic */ class createTempImageFile implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomAdvertisingIdClient IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List write;

    public /* synthetic */ createTempImageFile(CustomAdvertisingIdClient customAdvertisingIdClient, List list, List list2) {
        this.IconCompatParcelizer = customAdvertisingIdClient;
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
    }

    public final Object write(Object obj) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.IconCompatParcelizer;
        return customAdvertisingIdClient.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver().doOnNext(new deleteImage(customAdvertisingIdClient)).map(new exifTimeFromDate(customAdvertisingIdClient, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, (List) obj));
    }
}
