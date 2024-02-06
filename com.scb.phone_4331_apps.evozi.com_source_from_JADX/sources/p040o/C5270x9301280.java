package p040o;

import p040o.setCertificateError;
import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.setCertificateError$MediaBrowserCompat$CustomActionResultReceiver */
final class C5270x9301280<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetOnDeviceExtractionServerFactory> {
    private /* synthetic */ zzcz.zzf IconCompatParcelizer;
    private /* synthetic */ setCertificateError MediaBrowserCompat$ItemReceiver;

    C5270x9301280(setCertificateError setcertificateerror, zzcz.zzf zzf) {
        this.MediaBrowserCompat$ItemReceiver = setcertificateerror;
        this.IconCompatParcelizer = zzf;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetOnDeviceExtractionServerFactory) obj).write(this.IconCompatParcelizer.read.write);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.add(setCertificateError.IconCompatParcelizer.BUSINESS_REG_NUM);
    }
}
