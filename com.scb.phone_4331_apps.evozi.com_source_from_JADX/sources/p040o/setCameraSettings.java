package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCameraSettings */
public final /* synthetic */ class setCameraSettings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getStringValues write;

    public /* synthetic */ setCameraSettings(getStringValues getstringvalues, Throwable th) {
        this.write = getstringvalues;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValues getstringvalues = this.write;
        Throwable th = this.MediaBrowserCompat$ItemReceiver;
        C6909xbc088368 idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver = (C6909xbc088368) obj;
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.aj_();
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.write(getstringvalues.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
