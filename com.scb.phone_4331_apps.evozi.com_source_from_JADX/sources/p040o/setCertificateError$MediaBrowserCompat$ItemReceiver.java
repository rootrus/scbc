package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.setCertificateError$MediaBrowserCompat$ItemReceiver */
final class setCertificateError$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetOnDeviceExtractionServerFactory> {
    private /* synthetic */ zzcz.zzf MediaBrowserCompat$CustomActionResultReceiver;

    setCertificateError$MediaBrowserCompat$ItemReceiver(zzcz.zzf zzf) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzf;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetOnDeviceExtractionServerFactory) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write);
    }
}
