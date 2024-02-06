package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.ChecksumException */
public final /* synthetic */ class ChecksumException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getStringValues IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ChecksumException(getStringValues getstringvalues, Throwable th) {
        this.IconCompatParcelizer = getstringvalues;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValues getstringvalues = this.IconCompatParcelizer;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        C6909xbc088368 idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver = (C6909xbc088368) obj;
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.aj_();
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.write(getstringvalues.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
