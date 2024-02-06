package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.NetworkService$MediaBrowserCompat$ItemReceiver */
public final class NetworkService$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
    private /* synthetic */ NetworkService read;

    public NetworkService$MediaBrowserCompat$ItemReceiver(NetworkService networkService) {
        this.read = networkService;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        NetworkService.IconCompatParcelizer(this.read);
        ((PassportCaptureModule_GetIExtractionServerRttiFactory) obj).MediaBrowserCompat$ItemReceiver();
    }
}
