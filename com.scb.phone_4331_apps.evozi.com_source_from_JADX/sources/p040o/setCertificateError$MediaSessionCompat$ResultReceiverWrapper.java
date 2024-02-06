package p040o;

import p040o.setCertificateError;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCertificateError$MediaSessionCompat$ResultReceiverWrapper */
final class setCertificateError$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetOnDeviceExtractionServerFactory> {
    private /* synthetic */ setCertificateError.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    setCertificateError$MediaSessionCompat$ResultReceiverWrapper(setCertificateError.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetOnDeviceExtractionServerFactory) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
