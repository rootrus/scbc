package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetFields */
public final /* synthetic */ class nativeGetFields implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ nativeGetRows write;

    public /* synthetic */ nativeGetFields(nativeGetRows nativegetrows, String str) {
        this.write = nativegetrows;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str = this.IconCompatParcelizer;
        IdCaptureModule_GetIIdExtractionServerOnDeviceFactory idCaptureModule_GetIIdExtractionServerOnDeviceFactory = (IdCaptureModule_GetIIdExtractionServerOnDeviceFactory) obj;
        idCaptureModule_GetIIdExtractionServerOnDeviceFactory.MediaBrowserCompat$ItemReceiver(nativeGetRows.read(str));
        idCaptureModule_GetIIdExtractionServerOnDeviceFactory.read(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(str));
    }
}
