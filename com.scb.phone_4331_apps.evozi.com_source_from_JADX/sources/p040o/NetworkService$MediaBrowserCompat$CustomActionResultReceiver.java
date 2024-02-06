package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.NetworkService$MediaBrowserCompat$CustomActionResultReceiver */
final class NetworkService$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
    private /* synthetic */ NetworkService write;

    NetworkService$MediaBrowserCompat$CustomActionResultReceiver(NetworkService networkService) {
        this.write = networkService;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportCaptureModule_GetIExtractionServerRttiFactory passportCaptureModule_GetIExtractionServerRttiFactory = (PassportCaptureModule_GetIExtractionServerRttiFactory) obj;
        String str = this.write.MediaMetadataCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
        }
        String str2 = this.write.MediaBrowserCompat$MediaItem;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("principalAmount");
        }
        passportCaptureModule_GetIExtractionServerRttiFactory.MediaBrowserCompat$CustomActionResultReceiver(str, str2, zzct.zza.BUSINESS_OWNER == this.write.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver());
    }
}
