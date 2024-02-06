package p040o;

import p040o.PlaceEntity;

/* renamed from: o.getRealClientLibraryVersion */
public final /* synthetic */ class getRealClientLibraryVersion implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ createBundleFromClientSettings write;

    public /* synthetic */ getRealClientLibraryVersion(createBundleFromClientSettings createbundlefromclientsettings, String str) {
        this.write = createbundlefromclientsettings;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object write(Object obj) {
        createBundleFromClientSettings createbundlefromclientsettings = this.write;
        return createbundlefromclientsettings.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, ((PlaceEntity.zzb) obj).setExpandedFormat);
    }
}
