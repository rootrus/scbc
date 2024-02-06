package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setDecoderFactory */
public final /* synthetic */ class setDecoderFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String[] MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getStringValues MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean read;

    public /* synthetic */ setDecoderFactory(getStringValues getstringvalues, boolean z, String[] strArr) {
        this.MediaBrowserCompat$ItemReceiver = getstringvalues;
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = strArr;
    }

    public final void IconCompatParcelizer(Object obj) {
        boolean z = this.read;
        String[] strArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        C6909xbc088368 idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver = (C6909xbc088368) obj;
        if (z) {
            idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(getStringValues.IconCompatParcelizer(strArr));
        } else {
            idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.write();
        }
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.write(getStringValues.IconCompatParcelizer(strArr));
    }
}
