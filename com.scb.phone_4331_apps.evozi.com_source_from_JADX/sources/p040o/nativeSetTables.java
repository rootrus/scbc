package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeSetTables */
public final /* synthetic */ class nativeSetTables implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigure MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeSetTables(nativeConfigure nativeconfigure) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativeconfigure;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigure nativeconfigure = this.MediaBrowserCompat$CustomActionResultReceiver;
        IdCaptureModule_GetIParametersFactory idCaptureModule_GetIParametersFactory = (IdCaptureModule_GetIParametersFactory) obj;
        String str = nativeconfigure.read.IconCompatParcelizer;
        if (str == null || str.length() == 0) {
            idCaptureModule_GetIParametersFactory.IconCompatParcelizer();
        } else {
            idCaptureModule_GetIParametersFactory.MediaBrowserCompat$MediaItem(nativeconfigure.read.IconCompatParcelizer);
        }
    }
}
